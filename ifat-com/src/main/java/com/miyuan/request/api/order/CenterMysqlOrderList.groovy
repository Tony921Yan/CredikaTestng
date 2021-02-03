package com.miyuan.request.api.order

import com.miyuan.com.TestContext
import com.miyuan.factory.MiyuanRequest
import com.miyuan.service.OrderService
import com.miyuan.util.DateUtil
import com.miyuan.util.SetUtil

import java.util.stream.Collectors

class CenterMysqlOrderList extends MiyuanRequest {
    {
        super.api = "/api/order/center/getOrderList"
        super.params = ["userId", "userType", "orderStatus", "channelCode", "orderBuyType", "userLevels", "channelCodes",
                        "keyword", "page", "rows", "order","sort"]
    }


    MiyuanRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MiyuanRequest testAssert(TestContext testContext) {

        Integer userid = Integer.parseInt(testContext.get("userId"))
        Integer mods4 = SetUtil.Mod4(userid)
        println("userid:" + userid + "mod:" + mods4)

        List<Map> orderList = testContext.getResponse().data
        List<String> orderIds = orderList.stream().map { x -> return x."tradeId" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(userid, orderIds)
        assert orderIds.size() == dbOrders.size()
        dbOrders.stream().forEach { dbOrder ->
            Map order = orderList.stream().filter { x -> x.tradeId.toString() == dbOrder.get("channelOrderId").toString() }.collect(Collectors.toList()).get((0))
            String ordercreateTime = dbOrder.get("orderCreateTime").toString()

            Date datatime = DateUtil.strToDate(ordercreateTime)
            String Daytime = DateUtil.dateToymd(datatime)
            String Montime = DateUtil.dateToym(datatime)

            println("createTime" + ordercreateTime+ "--day:" + Daytime+"--mon:"+Montime)


        }
        return this
    }
 // oms_com_income_result 字段  断言
    MiyuanRequest OrderResultAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
        List<String> orderIds = orderList.stream().map { x -> return x."tradeId" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
            assert orderIds.size() == dbOrders.size()
            dbOrders.stream().forEach{dbOrder->
            Map order = orderList.stream().filter{x->x.tradeId.toString()==dbOrder.get("channelOrderId").toString()}.collect(Collectors.toList()).get((0))

            Integer  orderVersion = dbOrder.get("orderVersion")
            String   uuid = dbOrder.get("channelOrderId").toString()
            String ordercreateTime = dbOrder.get("orderCreateTime").toString()
            String  channel = dbOrder.get("channelCode")
            Date datatime = DateUtil.strToDate(ordercreateTime)
            String Daytime = DateUtil.dateToymd(datatime)
                //读取oms_com_income_result表对应的数据
            Integer sourcrVersion = OrderService.getMiyuanOrderIncomeResule(Daytime,channel,uuid).source_version
            Integer sourcrStatus = OrderService.getMiyuanOrderIncomeResule(Daytime,channel,uuid).source_status
             String  OrderCreateTime =OrderService.getMiyuanOrderIncomeResule(Daytime,channel,uuid).source_create_time
            Date  myslOrderCreateTime= DateUtil.strToDate(OrderCreateTime)
                //println(myslOrderCreateTime)
                //读取MongoDB 表订单状态
            Integer dborderStatus = Integer.parseInt (dbOrder.get("orderStatus").toString())
            Date  dbOrderCreateTime = DateUtil.strToDate(dbOrder.get("orderCreateTime").toString())
           // println(orderVersion)
            //判空
            if (!orderVersion) {
                println("orderVersion 为空")
            }else{
                assert orderVersion == sourcrVersion, "断言失败的UUID:" + uuid
                assert sourcrStatus == dborderStatus
                assert myslOrderCreateTime == dbOrderCreateTime
                //println("orderVersion："+orderVersion)


            }

        }
        return  this
    }

   // oms_com_income_item 字段  断言
    MiyuanRequest OrderItemAssert(TestContext testContext) {
        List<Map> orderList = testContext.getResponse().data
        List<String> orderIds = orderList.stream().map { x -> return x."tradeId" }.collect(Collectors.toList())
        List dbOrders = OrderService.getOrdersFromMongo(Integer.parseInt(testContext.get("userId").toString()), orderIds)
        assert orderIds.size() == dbOrders.size()
        dbOrders.stream().forEach{dbOrder->
            Map order = orderList.stream().filter{x->x.tradeId.toString()==dbOrder.get("channelOrderId").toString()}.collect(Collectors.toList()).get((0))
            //获取MongoDB对应的字段
            Integer  orderVersion = dbOrder.get("orderVersion")
            String   uuid = dbOrder.get("channelOrderId").toString()
            String ordercreateTime = dbOrder.get("orderCreateTime").toString()
            Date dbordercreateTime = DateUtil.strToDate(ordercreateTime)
            String orderPaidTime = dbOrder.get("orderPaidTime").toString()
            Date dborderpaidTime = DateUtil.strToDate(orderPaidTime)
            Integer dbcommission = dbOrder.get("commission")
            Integer dbbuytype = dbOrder.get("buyType")
            String  channel = dbOrder.get("channelCode")
            String dbgoodid= dbOrder.get("itemId").toString()
            //读取oms_com_income_item表对应的数据
            Map mysqlincomeitem =OrderService.getMiyuanOrderIncomeItem (Integer.parseInt(testContext.get("userId").toString()),uuid)
            assert mysqlincomeitem
            Integer sourcrVersion = mysqlincomeitem.source_version
            Integer sourcrStatus = mysqlincomeitem.status
            String  OrderCreateTime =mysqlincomeitem.source_create_time
            Date   myslOrderCreateTime= DateUtil.strToDate(OrderCreateTime)
            String  OrderPaidTime =mysqlincomeitem.source_paid_time
            Date  myslOrderPaidTime= DateUtil.strToDate(OrderPaidTime)
            //println(myslOrderCreateTime)
            //判空
            if (!orderVersion) {
                println("orderVersion 为空")
            }else{
                assert orderVersion == sourcrVersion
                assert sourcrStatus == dbOrder.get("orderStatus")
                assert myslOrderCreateTime == dbordercreateTime
                assert myslOrderPaidTime == dborderpaidTime
                assert mysqlincomeitem.commission == dbcommission
                assert mysqlincomeitem.buy_type == dbbuytype
                assert mysqlincomeitem.channel == channel
                assert mysqlincomeitem.goods_id == dbgoodid
                //println("orderVersion："+orderVersion)
                if (sourcrStatus == 3){
                    String ordersettlementTime = dbOrder.get("settlementTime").toString()
                    Date dbordersettlementTime = DateUtil.strToDate(ordersettlementTime)
                    assert   DateUtil.strToDate(mysqlincomeitem.source_settle_time.toString()) == dbordersettlementTime
                }else {
                    println("source_settle_time："+mysqlincomeitem.source_settle_time)
                   assert mysqlincomeitem.source_settle_time == null
                }

            }

        }
        return  this
    }


}

