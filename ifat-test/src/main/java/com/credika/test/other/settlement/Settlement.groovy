package com.credika.test.other.settlement
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Record
import org.testng.annotations.DataProvider
import org.testng.annotations.Test
//
class Settlement extends BaseTest{
    @Test(dataProvider = "orderData",groups = ["prod"])
//    @Test(dataProvider = "orderData",groups = ["uat"])
    void settlement(TestContext testContext) {
        String parentOrderNo = testContext.get("parentOrderNo")
        testContext.appendLog(new Record("母订单号", parentOrderNo))
        String orderNo = testContext.get("orderNo")
//        testContext.appendLog(new Record("子订单号", orderNo))
        List flowList = MysqlService.getSettlementFlow(parentOrderNo)  //结算流水表
        testContext.appendLog(new Record("结算流水表", flowList))
        Integer totalAmount = 0 //统计总流水表：分账-补差
        Integer amount = 0 //流水表交易金额',
        Integer tradeType = 0
        Integer entityType = 0
        Integer totalSupplierPrice = 0 //供应商结算价
        Integer totalCommission = 0 //小B佣金
        Integer totalWechatFee = 0 //微信手续费
        Integer orderInfoAmount =0 //订单实付金额
        Integer getOrderAfter =0  //订单售后成功金额
        //判断settlement表中数据是否在settlement_flow有数据
        for (Map order : flowList) {
            String flowOrderNo = order.trade_parent_order_no
            String tradeOrderNo = order.trade_order_no
            amount = order.amount as Integer  //'交易金额',
            tradeType = order.trade_type as Integer //'交易类型 1:分账 2:补差 3:解冻',
            entityType = order.entity_type as Integer  //'主体类型 1:店铺 2:供应商 3:平台 4:小蜜新媒体5:微信手续费',
//            testContext.appendLog(new Record("结算订单号:" + flowOrderNo + "；流水金额" ,amount))

            //统计母单流水表总额
            switch (tradeType){
                case 1:
                    totalAmount += amount
                    break
                case 2:
                    totalAmount -= amount
                    break
            }
            //通过母单找对应订单表中的实付金额
            List getOrderInfo = MysqlService.getOrderInfoPaidAmount(flowOrderNo)
            Integer getOrderActuallyPaidAmount = getOrderInfo.actually_paid_amount.get(0)
            List getOrderAfterInfo = MysqlService.getOrderAfterRefundAmount(flowOrderNo)
            if(getOrderAfterInfo.actually_refund_amount != []){
                getOrderAfter = getOrderAfterInfo.actually_refund_amount.get(0)
            }
            orderInfoAmount = getOrderActuallyPaidAmount - getOrderAfter

        }
//        testContext.appendLog(new Record("订单实付总额:" ,getOrderActuallyPaidAmount))
        testContext.appendLog(new Record("订单流水总额:" ,totalAmount))

        assert orderInfoAmount == totalAmount

            //从数据驱动的母单中找出子单；再通过子单在查出settlement_order_item中对应的结算数据
            List getSettlementOrderItems = MysqlService.getSettlementOrderItem(orderNo) //子单对应的单个或多个商品
            for (Map getSettlementOrderItem : getSettlementOrderItems) { //拿到订单商品金额，为日后做结算作准备
                testContext.appendLog(new Record("getSettlementOrderItem中对应的子单号：", getSettlementOrderItem))
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
            testContext.appendLog(new Record("供应商结算价", totalSupplierPrice))
            testContext.appendLog(new Record("微信手续费", totalWechatFee))
            testContext.appendLog(new Record("小B佣金", totalCommission))

        switch (tradeType){
            case 1:
                switch (entityType){
                    case 1:
                        testContext.appendLog(new Record("小B佣金", totalCommission) + amount)
                        assert totalCommission == amount
                        break
                    case 2:
//                        testContext.appendLog(new Record("供应商结算价", totalSupplierPrice) + amount)
                        println "供应商结算价" + totalSupplierPrice + amount
                        assert totalSupplierPrice == amount
                        break
                    case 5:
                        testContext.appendLog(new Record("微信手续费", totalWechatFee) + amount)
                        assert totalWechatFee == amount
                        break
                    default:
                        testContext.appendLog(new Record("当前订单号：",orderNo + "无流水数据"))
                }
            case 2:
                testContext.appendLog(new Record("当前订单号",orderNo + "也有补差:" + amount))
                break
            case 3:
                testContext.appendLog(new Record("当前订单号",orderNo + "3:解冻状态"))
                break
            default:
                testContext.appendLog(new Record("当前订单号",orderNo + "当前无结算流水数据"))
        }
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
