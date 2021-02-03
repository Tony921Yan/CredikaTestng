package com.miyuan.request.api.order

import com.miyuan.com.TestContext
import com.miyuan.factory.MiyuanRequest
import com.miyuan.service.OrderService
import com.miyuan.util.DateUtil
import com.miyuan.util.MoneyUtil

import java.util.stream.Collectors

class CenterGetOrderList extends MiyuanRequest {
    {
        super.api = "/api/order/center/getOrderList"
        super.params = ["userId", "userType", "orderStatus", "channelCode", "orderBuyType", "userLevels", "channelCodes",
                        "keyword", "page", "rows", "order","sort"]
    }


    MiyuanRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MiyuanRequest afterInvoke(TestContext testContext) {
        testContext.put("orderId",testContext.getResponse().data[0].tradeId)
        return this
    }

    MiyuanRequest preInvoke(TestContext testContext) {

    }

    MiyuanRequest baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        assert testContext.getResponse().data.size() == 10
        return this
    }
// 基础字段断言
    MiyuanRequest specialAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
       // List<String> orderIds = orderList.stream().filter {  order->!order.orderSn.toString().contains("*")}.map{x-> return x."tradeId"}.collect(Collectors.toList())
        //去掉* 过滤
        List<String> orderIds = orderList.stream().map { x -> return x."tradeId" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()),orderIds)

        println "接口列表长度"+orderIds.size()
        println "数据库列表长度"+dbOrders.size()
        assert orderIds.size() == dbOrders.size()
         dbOrders.stream().forEach{dbOrder->
            Map order = orderList.stream().filter{x->x.tradeId.toString()==dbOrder.get("channelOrderId").toString()}.collect(Collectors.toList()).get((0))
            //assert dbOrder.get("showOrderId").toString()==order.orderSn
            assert dbOrder.get("itemId").toString()==order.itemId
            assert dbOrder.get("itemName").toString()==order.itemName
            assert dbOrder.get("itemImg").toString()==order.itemImg
            assert MoneyUtil.changeF2Y(dbOrder.get("paymentAmount").toString()) == order.paymentAmount.toString()
            assert dbOrder.get("orderStatus").toString()==order.status
            assert MoneyUtil.changeF2Y(dbOrder.get("commission").toString()) == order.commission.toString()

        }
        return this
    }
 // failCase 断言
    MiyuanRequest failCaseShowAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
        //List<String> orderIds = orderList.stream().filter { order -> !order.orderSn.toString().contains("*") }.map { x -> return x."tradeId" }.collect(Collectors.toList())
        //去掉* 过滤
        List<String> orderIds = orderList.stream().map { x -> return x."tradeId" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
         assert orderIds.size() == dbOrders.size()
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.tradeId.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList()).get((0))
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
    MiyuanRequest FansOrderAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
        //List<String> orderIds = orderList.stream().filter { order -> !order.orderSn.toString().contains("*") }.map { x -> return x."tradeId" }.collect(Collectors.toList())
        //去掉* 过滤
        List<String> orderIds = orderList.stream().map { x -> return x."tradeId" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
        assert orderIds.size() == dbOrders.size()
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.tradeId.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList()).get((0))
            Integer buyType = dbOrder.get("buyType")
            assert buyType == 2
            return this

        }

    }

    //团队订单断言
    MiyuanRequest TeamsOrderAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
        //List<String> orderIds = orderList.stream().filter { order -> !order.orderSn.toString().contains("*") }.map { x -> return x."tradeId" }.collect(Collectors.toList())
        //去掉* 过滤
        List<String> orderIds = orderList.stream().map { x -> return x."tradeId" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
        //assert orderIds.size() == dbOrders.size()
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.tradeId.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList()).get((0))
            Integer buyType = dbOrder.get("buyType")
            assert buyType == 3
            return this

        }
    }

    // 隐私订单断言
    MiyuanRequest PrivacyOrderAssert (TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
       // List<String> orderIds = orderList.stream().filter { order -> !order.orderSn.toString().contains("*") }.map { x -> return x."tradeId" }.collect(Collectors.toList())
       //去掉* 过滤
        List<String> orderIds = orderList.stream().map { x -> return x."tradeId" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
        assert orderIds.size() == dbOrders.size()
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.tradeId.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList()).get((0))
           Integer dbPrivacy = dbOrder.get("privacy")
            Integer dbself = dbOrder.get("self")
           //mongdb 订单标识为隐私订单
            if(dbPrivacy == 1  ){
                if(!dbself){
                    assert  order.orderSn.toString().contains("**")
                    assert  order.createTime.toString().contains("**")
                    //println("判断隐私标识成功")
                }
            }else {
                assert dbOrder.get("showOrderId").toString()==order.orderSn
                assert DateUtil.strToDate(dbOrder.get("orderCreateTime").toString())==DateUtil.strToDate(order.createTime.toString())
            }
            return this
        }
    }

    // 淘宝比价订单标识
    MiyuanRequest tbOrderTypeAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
        //去掉* 过滤

        List<String> orderIds = orderList.stream().map { x -> return x."tradeId" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.tradeId.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList()).get((0))
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
    MiyuanRequest SettlementTimeAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
        //去掉* 过滤
        List<String> orderIds = orderList.stream().map { x -> return x."tradeId" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.tradeId.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList()).get((0))
            Integer tborderStatus = dbOrder.get("orderStatus")

            //结算时间断言
            if (tborderStatus==3) {


                /*
                String  dbsettlementTime = dbOrder.get("settlementTime")
               DateFormat time= new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss")
               DateFormat gmtFormate = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH)
               Date dateTime = gmtFormate.parse(dbsettlementTime)
               String tbsettltime = time.format(dateTime)
               println("换换数据库时间："+tbsettltime)
               assert  tbsettltime == order.settlementTime.toString()
               */
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
