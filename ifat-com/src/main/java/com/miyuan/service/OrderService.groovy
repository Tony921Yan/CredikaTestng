package com.miyuan.service


import com.miyuan.api.RabbitMqAPI
import com.miyuan.component.mq.rabbitmq.message.OrderEvent
import com.miyuan.infrastructure.common.enums.ChannelEnum

class OrderService {

    static Map getOrderFromMongo(Integer userId,String orderId){
        return MongoService.getUserOderByOrderId(userId,orderId)
    }

    static List<Map> getOrdersFromMongo(Integer userId,List orderIds){
        return MongoService.getUserOdersByOrderId(userId,orderIds)
    }

    static List<Map> getuserchanneltiemOrdersFromMongo(Integer userId, String channel,Date strattime ,Date endtime){
        return MongoService.getUserOdersBychannel(userId,channel,strattime,endtime)
    }

    static Map getOrdersSystemFromMysql(String FailCase) {
        return MysqlService.getFailCase(FailCase)
    }

    static Map getMiyuanOrderIncomeResule (String time,String channel,String sourceId){
        return MysqlService.getOrderIncomeResult(time,channel,sourceId)
    }
//查询MySQL订单明细
    static Map getMiyuanOrderIncomeItem (Integer userid, String sourceId){
        return MysqlService.getOrderIncomeItem(userid,sourceId)

    }
    //删除MySQL订单明细
    static Integer deleteOrderIncomeItem(Integer userId){
        return MysqlService.deleteOrderIncomeItem(userId)
    }

    //删除MySQL订单分佣明细
    static Integer deleteOrderIncomeItemDetail(Integer userId){
        return MysqlService.deleteOrderIncomeItemDetail(userId)
    }
    //删除MySQL订单小V预处理数据
    static Integer deleteOrderIncomeResultSmall(Integer userId){
        return MysqlService.deleteOrderIncomeResultSmall(userId)
    }

    //删除MySQL订单大V预处理数据
    static Integer deleteOrderIncomeResultBigvip(Integer userId){
        return MysqlService.deleteOrderIncomeResultBigvip(userId)
    }
    //删除MySQL 天统计数据

    static Integer deleteDayIncom(Integer userId,Date time){
        return MysqlService.deleteDayIncom(userId,time)
    }
    //删除MySQL 月统计数据

    static Integer deleteMonthIncom(Integer userId,Date time){
        return MysqlService.deleteMonthIncom(userId,time)
    }

    //删除MySQL 总统计数据

    static Integer deleteTotalIncom(Integer userId){
        return MysqlService.deleteTotalIncom(userId)
    }
    //订单MySQL订单数统计
    static Map getOrderItemCount(Integer userId,String channel,String starTime,String endTimed){
        return MysqlService.getOrderItemCount(userId,channel,starTime,endTimed)

    }

    static Map getOrderItemCommission (Integer userId,String channel,String starTime,String endTimed){
        return MysqlService.getOrderItemCommission (userId,channel,starTime,endTimed)

    }
    //结算订单MySQL订单数统计
    static Map getOrderSettleItemCommission (Integer userId,String channel,String starTime,String endTimed){
        return MysqlService.getOrderSettleItemCommission (userId,channel,starTime,endTimed)

    }
    static Map getOrderSettleItemCount(Integer userId,String channel,String starTime,String endTimed){
        return MysqlService.getOrderSettleItemCount(userId,channel,starTime,endTimed)

    }

    static List<Map> getMysqlChannlDay(Integer userId,String channel,Date time){
        return MysqlService.getChannlDay(userId,channel,time)
    }

    //查询某渠道日收益
    static Map getChannlStatDay(Integer userId,String channel,String statKey,Date time) {
        return MysqlService.getChannlStatDay(userId,channel,statKey,time)
    }

    // 订单所有渠道天统计佣金
  static Map getOrderDayCommission (Integer userId,String statKey,Date time){
      return MysqlService.getOrderDayCommission(userId,statKey,time)

  }

    //订单所有渠道天订单数统计
    static Map getOrderDayCount (Integer userId,String statKey,Date time){
        return MysqlService.getOrderDayCount(userId,statKey,time)

    }
    // 订单渠道月统计佣金
    static Map getChannelOrderMonthCommission (Integer userId,String channel,String statKey,Date time){
        return MysqlService.getChannelOrderMonthCommission(userId,channel,statKey,time)

    }
    //订单渠道月订单统计
    static Map getChannelOrderMonthCount(Integer userId,String channel,String statKey,Date time) {
        return MysqlService.getChannelOrderMonthCount(userId,channel,statKey,time)

    }

    // 订单所有渠道月统计佣金
    static Map getOrderMonthCommission (Integer userId,String statKey,Date time){
        return MysqlService.getOrderMonthCommission(userId,statKey,time)

    }
    // 订单所有渠道订单统计
    static Map getOrderMonthCount(Integer userId,String statKey,Date time) {
        return MysqlService.getOrderMonthCount(userId,statKey,time)
    }

        static List<Map> getMysqlChannlMonth(Integer userId,String channel,Date time){
        return MysqlService.getChannlMonth(userId,channel,time)
    }
    static List<Map> getMysqlChannlTotal(Integer userId,String channel){
        return MysqlService.getChannlTotal(userId,channel)
    }

    static List<Map> getFailOrderresult (Integer userid,String channel,String sourcestatus,String stime){
        return MysqlService.getFailOrderresult(userid,channel,sourcestatus,stime)

    }
    //淘宝订单列表
    static List<Map> getTbOrdersFromMongo(List orderIds){
        return MongoService.getTbOdersByOrderId(orderIds)
    }
    //京东订单列表
    static List<Map> getJdOrdersFromMongo(List orderIds){
        return MongoService.getJdOdersByOrderId(orderIds)
    }
    //cps订单列表
    static List<Map> getCpsOrdersFromMongo(List orderIds){
        return MongoService.getCpsOdersByOrderId(orderIds)
    }

    static void sendOrderMessage(String channelCode, String orderId, Date orderCreateTime, Date settlementTime,
                                 Integer orderStatus, Integer userId, Integer orderMode, Date orderPaidTime,
                                 Integer paymentAmount, Date depositTime, String itemId){
        OrderEvent orderEvent = new OrderEvent(
                ChannelEnum.getChannelByCode(channelCode),
                orderId,
                orderCreateTime,
                settlementTime,
                orderStatus,
                userId,
                orderMode,
                orderPaidTime,
                paymentAmount,
                depositTime,
                itemId)
        RabbitMqAPI.basicPublish("order-change-update-dail-fans-rank-queue",orderEvent)
    }
    //mongodb 预估佣金统计
    static List<Map> getSumOrder(Integer userId,String channelCode,List orderStatus,Date startTime,Date endTime){
        return MongoService.getSumOrder(userId,channelCode,orderStatus,startTime,endTime)
    }
    // mongdb 结算预估佣金
    static List<Map> getSumSettleOrder(Integer userId,String channelCode,Date startTime,Date endTime){
        return MongoService.getSumSettleOrder(userId,channelCode,startTime,endTime)
    }
}
