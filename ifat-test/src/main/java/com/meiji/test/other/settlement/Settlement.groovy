package com.meiji.test.other.settlement
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Record
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class Settlement extends BaseTest{
//    @Test(dataProvider = "orderData",groups = ["prod"])
    @Test(dataProvider = "orderData",groups = ["uat"])
    void settlement(TestContext testContext){
        String parentOrderNo = testContext.get("parentOrderNo")
        testContext.appendLog(new Record("母订单号",parentOrderNo))
        List flowList = MysqlService.getSettlementFlow(parentOrderNo)  //结算流水表
        testContext.appendLog(new Record("结算流水表",flowList))
        Integer totalAmount =0

        //判断settlement表中数据是否在settlement_flow有数据

        for(Map order:flowList){
            String flowOrderNo = order.trade_parent_order_no
            Integer amount = order.amount as Integer
            Integer tradeType = order.trade_type as Integer
            Integer entityType = order.entity_type as Integer
//            testContext.appendLog(new Record("结算订单号:" + flowOrderNo + "；流水金额" ,amount))
            if(tradeType ==2 && entityType == 3){
                totalAmount -= amount
            }else
                totalAmount += amount
        }
        //得出当前母单号的流水总额，日后与settlement_order_item对应的订单号金额做比较
        testContext.appendLog(new Record("母订单号:" + flowList + "；流水总额" ,totalAmount))


        //从数据驱动的母单中找出子单；再通过子单在查出settlement_order_item中对应的结算数据
        List getSettlementOrder = MysqlService.getSettlementOrder(parentOrderNo)
        Integer totalSupplierPrice = 0 //供应商结算价
        Integer totalCommission =0 //小B佣金
        Integer totalWechatFee = 0 //微信手续费
        for(Map orderItem:getSettlementOrder){
            String OrderNo = orderItem.trade_order_no
            List getSettlementOrderItems = MysqlService.getSettlementOrderItem(OrderNo)
            for(Map getSettlementOrderItem:getSettlementOrderItems){
                Integer salePrice = getSettlementOrderItem.sale_price as Integer //'售卖商品总价格'
                Integer totalSalePrice = getSettlementOrderItem.total_sale_price as Integer //'售卖商品总价格'
                Integer merchantRate = getSettlementOrderItem.merchant_rate as Integer //'平台分账比例'
                Integer supplierPrice = getSettlementOrderItem.supplier_price as Integer  //'供应商佣金'
                Integer subsidyAmount = getSettlementOrderItem.subsidy_amount as Integer  //'补贴金额'
                Integer taxation = getSettlementOrderItem.taxation as Integer //'税率'
                Integer taxes = getSettlementOrderItem.taxes as Integer  //'税费'
                Integer refundAmount = getSettlementOrderItem.refund_amount as Integer  //'退款金额'
                Integer commission = getSettlementOrderItem.commission as Integer  //'B端佣金'
                Integer skuNum = getSettlementOrderItem.sku_num as Integer  //'商品数量'
                Integer subsidyCommission = getSettlementOrderItem.subsidy_commission as Integer //'活动佣金'
                Integer wechatFee = getSettlementOrderItem.wechat_fee as Integer //'微信手续费'
                Integer freight = getSettlementOrderItem.freight as Integer  //'运费'
                Integer discountAmount = getSettlementOrderItem.discount_amount as Integer //'优惠金额'
                Integer actuallyDiscountAmount = getSettlementOrderItem.actually_discount_amount as Integer //'实际优惠金额'
//                testContext.appendLog(new Record("售卖商品总价格: "+ salePrice + ",售卖商品总价格"+totalSalePrice+
//                        ",平台分账比例:"+merchantRate +",供应商佣金:"+supplierPrice+",补贴金额:"+subsidyAmount+
//                        ",税率:"+taxation+",税费:"+taxes+",退款金额:"+refundAmount+",B端佣金:"+commission+
//                        ",商品数量:"+skuNum+",活动佣金:"+subsidyCommission+",微信手续费:"+wechatFee+",运费:"+freight+
//                        ",优惠金额:"+discountAmount+",实际优惠金额",actuallyDiscountAmount))
                totalSupplierPrice += supplierPrice
                totalWechatFee += wechatFee
                totalCommission += commission
            }
        }
        testContext.appendLog(new Record("供应商结算价",totalSupplierPrice))
        testContext.appendLog(new Record("微信手续费",totalWechatFee))
        testContext.appendLog(new Record("小B佣金",totalCommission))
    }

    @DataProvider
    TestContext[] orderData(){
        List<Map> orderList = MysqlService.getSettlementOrder()
        List testContextList = new ArrayList()
        orderList.forEach{it->
            TestContext testContext = new TestContext()
            testContext.put("parentOrderNo",it.trade_parent_order_no)
            testContext.put("orderNo",it.trade_order_no)
            testContextList.add(testContext)
        }
        return testContextList
    }
}
