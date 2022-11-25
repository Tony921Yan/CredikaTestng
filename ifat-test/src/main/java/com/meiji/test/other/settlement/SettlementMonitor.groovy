package com.meiji.test.other.settlement
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Record
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class SettlementMonitor extends BaseTest{
    private final static List finishAfterStatus = ["6", "7"] //售后单状态（1 待审核,2 待退货,3待收货验货,4待退款审核,5待退款,6 已完成,7 已取消）
    private final static List normalOrderStatus = ["3","4","5","6","7"] //'交易单状态 1 待支付，2 待审核，3 待发货/已审核 ，4 出库中，5 已发货，6已签收，7已完成，8 已取消',
//    @Test(dataProvider = "orderData",groups = ["prod"])
    @Test(dataProvider = "orderData",groups = ["uat"])
    void settleMonitor(TestContext testContext){
        Date now = new Date()
        String parentOrderNo = testContext.get("parentOrderNo")
        testContext.appendLog(new Record("父订单号",parentOrderNo))
        List subOrderList = MysqlService.getOrderByParentOrderNo(parentOrderNo)
        testContext.appendLog(new Record("订单列表",subOrderList))
        Date settleDate = now
        for(Map order:subOrderList){
            String orderNo = order.trade_order_no
            Date orderDate = order.gmt_create
            String orderStatus = order.state
            String settlementState = order.settlement_state
            if(orderStatus == "8"){
                assert settlementState == "3","期望已取消的订单结算取消,订单号"+orderNo
            }
            if(!normalOrderStatus.contains(orderStatus)){
                continue
            }
            List logistic = MysqlService.getOrderLogistic(orderNo)
            testContext.appendLog(new Record("子订单号"+orderNo+"发货信息",logistic))
            for(Map map:logistic){
                Date logisticDate = map.gmt_create
                Date logisticSettleDate = DateUtil.dateAdd(logisticDate,Calendar.DATE,7)
                settleDate = settleDate > logisticSettleDate ?settleDate:logisticSettleDate
            }
            List afterOrder = MysqlService.getAfterOrder(orderNo)
            testContext.appendLog(new Record("子订单号"+orderNo+"售后信息",afterOrder))
            for(Map map:afterOrder) {
                String afterCode = map.after_code
                String afterStatus = map.after_status
                String afterType = map.after_type
                Date afterDate = map.gmt_create
                switch (afterStatus){
                    case ["6","7"]:
                        Date afterSettleDate = DateUtil.dateAdd(orderDate, Calendar.DATE, 21)
                        settleDate = settleDate > afterSettleDate ? settleDate : afterSettleDate
                        break
                    case "1":
                        Date expAfterDate = DateUtil.dateAdd(afterDate,Calendar.DATE,7)
                        assert expAfterDate >= now,"期望14天内售后审核,售后单"+afterCode
                        break
                    case "2":
                        Map afterOrderLog = MysqlService.getAfterOrderLog(afterCode,2)
                        assert afterOrderLog != null,"售后状态流转2（待退货）缺失"
                        Date logDate = afterOrderLog.gmt_create
                        Date expAfterDate = DateUtil.dateAdd(logDate,Calendar.DATE,3)
                        assert expAfterDate >= now,"期望3天内售后退货,售后单"+afterCode
                        break
                    case "3":
                        List afterLogisticList = MysqlService.getOrderLogistic(afterCode)
                        assert afterLogisticList.size() >= 1,"期望有售后物流,售后单"+afterCode
                        Map afterLogistic = afterLogisticList.get(0)
                        Date logisticDate = afterLogistic.gmt_create
                        Date logisticFinishDate = DateUtil.dateAdd(logisticDate,Calendar.DATE,14)
                        assert logisticFinishDate >= now,"期望14天内确认验货,售后单"+afterCode
                        break
                    case "4":
                        if(afterType=="2") {
                            Map afterOrderLog = MysqlService.getAfterOrderLog(afterCode, 4)
                            assert afterOrderLog != null, "售后状态流转4（待退款审核）缺失"
                            Date logDate = afterOrderLog.gmt_create
                            Date expAfterDate = DateUtil.dateAdd(logDate, Calendar.DATE, 3)
                            assert expAfterDate >= now, "期望3天内待退款审核,售后单" + afterCode
                        }
                        break
                    case "5":
                        Map afterOrderLog = MysqlService.getAfterOrderLog(afterCode,5)
                        assert afterOrderLog != null,"售后状态流转5（待退款）缺失"
                        Date logDate = afterOrderLog.gmt_create
                        Date expAfterDate = DateUtil.dateAdd(logDate,Calendar.DATE,1)
                        assert expAfterDate >= now,"期望1天内完成退款,售后单"+afterCode
                        break
                }
            }
            //无物流无售后期望7天内发货
//            if(logistic.size()==0 && afterOrder.size()==0) {
//                Date expLogisticDate = DateUtil.dateAdd(orderDate,Calendar.DATE,7)
//                assert expLogisticDate >= now,"期望7天内发货，订单号"+orderNo
//            }
        }
        assert  settleDate >= now ,"期望结算时间大于当前时间，父订单号"+parentOrderNo
    }

    @DataProvider
    TestContext[] orderData(){
        List<Map> orderList = MysqlService.getUnSettleOrder()
        List testContextList = new ArrayList()
        orderList.forEach{it->
            TestContext testContext = new TestContext()
            testContext.put("parentOrderNo",it.trade_parent_order_no)
            testContext.put("shopName",it.shop_name)
            testContext.put("description","【"+it.shop_name+"】订单号"+it.trade_parent_order_no)
            testContextList.add(testContext)
        }
        return testContextList
    }
}
