package com.miyuan.request.infra.order

import com.miyuan.com.TestContext
import com.miyuan.factory.InfraRequest
import com.miyuan.factory.MiyuanRequest
import com.miyuan.service.MysqlService
import com.miyuan.service.OrderService
import com.miyuan.util.DateUtil
import com.miyuan.util.MoneyUtil

import java.util.stream.Collectors

class CenterGetOrderListnew extends InfraRequest {
    {
        super.api = "/api/order/getOrderList/new"
        super.params = [ "page","rows","condition"]
    }

    InfraRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    InfraRequest afterInvoke(TestContext testContext) {
        testContext.put("orderId",testContext.getResponse().data[0].uuid)
        return this
    }

    InfraRequest preInvoke(TestContext testContext) {
        String a = testContext.getResponse().code.toString()
        println(a)
        return this
    }

    InfraRequest baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        List<Map> orderList = testContext.getResponse().data.dataList

        assert orderList.size() == 10
        return this
    }
// 基础字段断言
    InfraRequest specialAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data.dataList
        List<Map> tbOrderList =  new ArrayList()
        List<Map> jdOrderList = new ArrayList()
        List<Map> cpsOrderList = new ArrayList()
        for(int i = 0; i < orderList.size(); i++){
            if (orderList.get(i)['channelCode'] == 'TB'){
                tbOrderList.add(orderList.get(i))
                //println "淘宝订单"+i
            }else if(orderList.get(i)['channelCode'] == 'JD'){
                jdOrderList.add(orderList.get(i))
                //println "JD订单"+i
            }else{
                cpsOrderList.add(orderList.get(i))
               // println "CPS订单"+i
            }
        }
        //淘宝订单校验
        List orderIds = tbOrderList.stream().map { x -> return Long.valueOf(x."uuid" )}.collect(Collectors.toList())
        List dbTbOrders = OrderService.getTbOrdersFromMongo(orderIds)
       // println "接口列表长度"+orderIds.size()
       // println "数据库列表长度"+dbOrders.size()
        assert orderIds.size() == dbTbOrders.size()
        dbTbOrders.stream().forEach { dbTbOrder ->
            Map tborder = tbOrderList.stream().filter { x -> x.uuid.toString() == dbTbOrder.get("_id").toString() }.collect(Collectors.toList()).get((0))
            //String MysqlCommsion = MysqlService.getOrderIncomeItem(Integer.parseInt(testContext.get("userId").toString()),tborder.uuid).commission
            //assert dbTbOrder.get("tradeParentId").toString()==tborder.uuidParentId
            //String itemId =dbTbOrder.get("itemId").toString()
            // println(itemId)
            assert dbTbOrder.get("itemId").toString() == tborder.goodsId
            assert dbTbOrder.get("itemName").toString() == tborder.goodsName
            assert dbTbOrder.get("itemImg").toString() == tborder.goodsImg
            //mongodb 付款金额和接口款金额佣金断言
            assert MoneyUtil.changeF2Y(dbTbOrder.get("paymentAmount").toString()) == tborder.paymentAmount.toString()
            assert dbTbOrder.get("orderStatus").toString() == tborder.status
            //MySQL佣金和接口佣金断言
            // assert MoneyUtil.changeF2Y(MysqlCommsion) == tborder.commission.toString()
        }
            //京东订单
            List jdOrderIds = jdOrderList.stream().map { x -> return x."uuid" }.collect(Collectors.toList())
            List dbJbOrders = OrderService.getJdOrdersFromMongo(jdOrderIds)
            assert jdOrderIds.size() == dbJbOrders.size()
            dbJbOrders.stream().forEach{dbJbOrder->
                Map jdorder = jdOrderList.stream().filter{x->x.uuid.toString()==dbJbOrder.get("_id").toString()}.collect(Collectors.toList()).get((0))
                assert dbJbOrder.get("goodId").toString()==jdorder.goodsId
                assert dbJbOrder.get("goodName").toString()==jdorder.goodsName
                assert dbJbOrder.get("goodImg").toString()==jdorder.goodsImg
                //mongodb 付款金额和接口款金额佣金断言
                assert MoneyUtil.changeF2Y(dbJbOrder.get("paymentAmount").toString()) == jdorder.paymentAmount.toString()
                assert dbJbOrder.get("orderStatus").toString()==jdorder.status
        }
        //cps订单
        List cpsOrderIds = cpsOrderList.stream().map { x -> return x."uuid" }.collect(Collectors.toList())
        List dbCpsOrders = OrderService.getCpsOrdersFromMongo(cpsOrderIds)
        assert cpsOrderIds.size() == dbCpsOrders.size()
        dbCpsOrders.stream().forEach{dbCpsOrder->
            Map cpsorder = cpsOrderList.stream().filter{x->x.uuid.toString()==dbCpsOrder.get("_id").toString()}.collect(Collectors.toList()).get((0))
            assert dbCpsOrder.get("itemId").toString()==cpsorder.goodsId.toString()
            assert dbCpsOrder.get("itemName").toString()==cpsorder.goodsName.toString()
            assert dbCpsOrder.get("itemImg").toString()==cpsorder.goodsImg.toString()
            //mongodb 付款金额和接口款金额佣金断言
            assert MoneyUtil.changeF2Y(dbCpsOrder.get("paymentAmount").toString()) == cpsorder.paymentAmount.toString()
            assert dbCpsOrder.get("orderStatus").toString()==cpsorder.status
        }

        return this
    }
    // 佣金断言
    InfraRequest commissionnAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data.dataList
        List orderIds = orderList.stream().map { x -> return x.uuid.toString() }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()),orderIds)
        dbOrders.stream().forEach{dbOrder->
            Map order = orderList.stream().filter{x->x.uuid.toString()==dbOrder.get("channelOrderId").toString()}.collect(Collectors.toList()).get((0))
            Integer MysqlCommsion = MysqlService.getOrderIncomeItem(Integer.parseInt(testContext.get("userId").toString()),order.uuid).commission
            //获取接口的首单补贴佣金
            String firstCommission=order.firstCommission.toString()
            String subsidy=order.subsidy.toString()

            //MySQL佣金和接口佣金断言
            assert MysqlCommsion == MoneyUtil.changeY2F(order.commission.toString())
            //mongodb佣金和接口佣金断言
            assert Integer.parseInt(dbOrder.get("commission").toString()) == MoneyUtil.changeY2F(order.commission.toString())
        }
        return this
    }
 // failCase 断言
    InfraRequest failCaseShowAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
        List<String> orderIds = orderList.stream().map { x -> return x."uuid" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.uuid.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList()).get((0))
            String  FailCase = dbOrder.get("failCase")
           // println(FailCase)
            //判空
            if (!FailCase) {
                assert  order.failCaseShow ==null
            }else{
                String FailCaseShow = OrderService.getMiyuanOrderIncomeResule()
                // println(FailCaseShow)
                assert FailCaseShow == order.failCaseShow
            }

        }
        return  this
    }

    //粉丝订单断言
    InfraRequest FansOrderAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data

        List<String> orderIds = orderList.stream().map { x -> return x."uuid" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
        assert orderIds.size() == dbOrders.size()
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.uuid.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList())
            Integer buyType = dbOrder.get("buyType")
            assert buyType == 2
            return this

        }

    }

    //团队订单断言
    InfraRequest TeamsOrderAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
        //List<String> orderIds = orderList.stream().filter { order -> !order.orderSn.toString().contains("*") }.map { x -> return x."tradeId" }.collect(Collectors.toList())
        //去掉* 过滤
        List<String> orderIds = orderList.stream().map { x -> return x."uuid" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
        //assert orderIds.size() == dbOrders.size()
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.uuid.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList()).get((0))
            Integer buyType = dbOrder.get("buyType")
            assert buyType == 3
            return this

        }
    }

    // 隐私订单断言
    InfraRequest PrivacyOrderAssert (TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data.dataList
        List<Map> tbOrderList =  new ArrayList()
        List<Map> jdOrderList = new ArrayList()
        List<Map> cpsOrderList = new ArrayList()
        for(int i = 0; i < orderList.size(); i++){
            if (orderList.get(i)['channelCode'] == 'TB'){
                tbOrderList.add(orderList.get(i))
                //println "淘宝订单"+i
            }else if(orderList.get(i)['channelCode'] == 'JD'){
                jdOrderList.add(orderList.get(i))
                //println "JD订单"+i
            }else{
                cpsOrderList.add(orderList.get(i))
                //println "CPS订单"+i
            }
        }
       // 淘宝订单隐私订单
        List orderIds = tbOrderList.stream().map { x -> return Long.valueOf(x."uuid" )}.collect(Collectors.toList())
        List dbTbOrders = OrderService.getTbOrdersFromMongo(orderIds)
        assert orderIds.size() == dbTbOrders.size()
        dbTbOrders.stream().forEach { dbTbOrder ->
            Map tborder = tbOrderList.stream().filter { x -> x.uuid.toString() == dbTbOrder.get("_id").toString() }.collect(Collectors.toList()).get((0))

           String dbPrivacy = dbTbOrder.get("privacy").toString()
            String isSelf =  tborder.isSelf.toString()
           //mongdb 订单标识为隐私订单
            if(dbPrivacy == '1'  ){
                if(isSelf == 'false'){
                    assert  tborder.uuidParentId.toString().contains("**")
                    assert  tborder.sourceCreateTime.toString().contains("**")
                    //println("判断隐私标识成功")
                }else {
                    //判断自购隐私标识成功
                    assert dbTbOrder.get("tradeParentId").toString()==tborder.uuidParentId

                    assert DateUtil.strToDate(dbTbOrder.get("orderCreateTime").toString())==DateUtil.strToDate(tborder.sourceCreateTime.toString())
                }

            }else {
                // 判断非隐私标识成功
                assert dbTbOrder.get("tradeParentId").toString()==tborder.uuidParentId
                assert DateUtil.strToDate(dbTbOrder.get("orderCreateTime").toString())==DateUtil.strToDate(tborder.sourceCreateTime.toString())
            }
        }
        //京东隐私订单
        List orderJdIds = jdOrderList.stream().map { x -> return x."uuid" }.collect(Collectors.toList())
        List dbJdOrders = OrderService.getJdOrdersFromMongo(orderJdIds)
        assert orderJdIds.size() == dbJdOrders.size()
        dbJdOrders.stream().forEach { dbJdOrder ->
            Map jdorder = jdOrderList.stream().filter { x -> x.uuid.toString() == dbJdOrder.get("_id").toString() }.collect(Collectors.toList()).get((0))

            String dbJdPrivacy = dbJdOrder.get("privacy").toString()
            String isSelfJd =  jdorder.isSelf.toString()
            //mongdb 订单标识为隐私订单
            if(dbJdPrivacy == '1'  ){
                if(isSelfJd == 'false'){
                    assert  jdorder.uuidParentId.toString().contains("**")
                    assert  jdorder.sourceCreateTime.toString().contains("**")
                    //println("判断隐私标识成功")
                }else {
                    //判断自购隐私标识成功
                    assert dbJdOrder.get("orderId").toString()==jdorder.uuidParentId

                    assert DateUtil.strToDate(dbJdOrder.get("orderCreateTime").toString())==DateUtil.strToDate(jdorder.sourceCreateTime.toString())
                }

            }else {
                // 判断非隐私标识成功
                assert dbJdOrder.get("orderId").toString()==jdorder.uuidParentId
                assert DateUtil.strToDate(dbJdOrder.get("orderCreateTime").toString())==DateUtil.strToDate(jdorder.sourceCreateTime.toString())
            }
        }
        // CPS 隐私订单
        List orderCpsIds = cpsOrderList.stream().map { x -> return x."uuid" }.collect(Collectors.toList())
        List dbCpsOrders = OrderService.getCpsOrdersFromMongo(orderCpsIds)
        assert orderCpsIds.size() == dbCpsOrders.size()
        dbCpsOrders.stream().forEach { dbCpsOrder ->
            Map cpsorder = cpsOrderList.stream().filter { x -> x.uuid.toString() == dbCpsOrder.get("_id").toString() }.collect(Collectors.toList()).get((0))

            String dbCpsPrivacy = dbCpsOrder.get("privacy").toString()
            String isSelfCps =  cpsorder.isSelf.toString()
            //mongdb 订单标识为隐私订单
            if(dbCpsPrivacy == '1'  ){
                if(isSelfCps == 'false'){
                    assert  cpsorder.uuidParentId.toString().contains("**")
                    assert  cpsorder.sourceCreateTime.toString().contains("**")
                    //println("判断隐私标识成功")
                }else {
                    //判断自购隐私标识成功
                    assert dbCpsOrder.get("tradeParentId").toString()==cpsorder.uuidParentId

                    assert DateUtil.strToDate(dbCpsOrder.get("orderCreateTime").toString())==DateUtil.strToDate(cpsorder.sourceCreateTime.toString())
                }

            }else {
                // 判断非隐私标识成功
                assert dbCpsOrder.get("tradeParentId").toString()==cpsorder.uuidParentId
                assert DateUtil.strToDate(dbCpsOrder.get("orderCreateTime").toString())==DateUtil.strToDate(cpsorder.sourceCreateTime.toString())
            }
        }

            return this
        }


    // 淘宝比价订单标识
    InfraRequest tbOrderTypeAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
        //去掉* 过滤
        List<String> orderIds = orderList.stream().map { x -> return x."uuid" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.uuid.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList()).get((0))
           Integer dbOrderType = dbOrder.get("tbOrderType")

            //比价标签判断
            if (dbOrderType==1) {
                assert  order.tbOrderType ==1
                println("判断比价标识成功")
            }else{

                assert order.tbOrderType==0
                assert !dbOrderType
            }

        }
        return  this
    }

   // 结算时间校验
    InfraRequest SettlementTimeAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
        //去掉* 过滤
        List<String> orderIds = orderList.stream().map { x -> return x."uuid" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.uuid.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList()).get((0))
            Integer tborderStatus = dbOrder.get("orderStatus")

            //结算时间断言
            if (tborderStatus==3) {

                assert DateUtil.strToDate(dbOrder.get("settlementTime").toString())==DateUtil.strToDate(order.settlementTime.toString())
                println("判断结算时间成功")
            }else{

                assert !dbOrder.get("settlementTime")
            }

        }
        return  this
    }

    // 数据库version 断言

}
