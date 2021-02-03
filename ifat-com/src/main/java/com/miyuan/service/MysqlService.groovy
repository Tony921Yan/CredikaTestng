package com.miyuan.service

import com.miyuan.api.MysqlAPI
import com.miyuan.util.SetUtil
import com.miyuan.util.DateUtil


class MysqlService extends MysqlAPI {

    static Map getUserInfo(Integer userId){
        return miyuanSql.firstRow("select id,phone,invite_code,relation_id,root_pid from tb_user where id = $userId")
    }
    static Map getFailCase(String FailCase){
        return miyuanSql.firstRow("select fail_case_show  from tb_order_fail_case_show where id= $FailCase")
    }
    static Map getOrderIncomeResult(String stime,String channel,String sourceId){
        String sqlname = "oms_com_income_result_"+stime
        String sql  ="select * from "+sqlname + " where channel="+ "'"+channel + "'" + " and source_id =" + "'"+sourceId+"'"
        return miyuanOrderSql.firstRow(sql)
    }
//查询MySQL订单明细
    static Map getOrderIncomeItem(Integer userId,String sourceId){
        Integer MysqltableMod =SetUtil.Mod256(userId)
        String sqlname = "oms_com_income_item_"+MysqltableMod
        String sql  ="select * from "+sqlname + " where user_id="+ "'"+userId + "'" + " and uuid =" + "'"+sourceId+"'"
        return getOrderShardSql(userId).firstRow(sql)
    }
//清除用户的订单明细
    static Integer deleteOrderIncomeItem(Integer userId){
        Integer MysqltableMod =SetUtil.Mod256(userId)
        String sqlname = "oms_com_income_item_"+MysqltableMod
        String sql  ="delete from "+sqlname + " where user_id="+ "'"+userId + "'"
        return getOrderShardSql(userId).executeUpdate(sql)
    }
//清除订单分佣明细
    static Integer deleteOrderIncomeItemDetail(Integer userId) {
        Integer MysqltableMod = SetUtil.Mod256(userId)
        String sqlname = "oms_com_income_item_detail_" + MysqltableMod
        String sql = "delete from " + sqlname + " where user_id=" + "'" + userId + "'"
        return getOrderShardSql(userId).executeUpdate(sql)
    }

    //清除小V 临时数据
    static Integer deleteOrderIncomeResultSmall(Integer userId) {

        String sqlname = "oms_com_income_result_small"
        String sql = "delete from " + sqlname + " where user_id=" + "'" + userId + "'"
        return getOrderShardSql(userId).executeUpdate(sql)
    }

    //清除大V 临时数据
    static Integer deleteOrderIncomeResultBigvip(Integer userId) {

        String sqlname = "oms_com_income_result_bigvip"
        String sql = "delete from " + sqlname + " where user_id=" + "'" + userId + "'"
        return getOrderShardSql(userId).executeUpdate(sql)
    }
    // 清除天统计
    static Integer deleteDayIncom(Integer userId,Date time) {
        Integer MysqltableMod =SetUtil.Mod32(userId)
        String  monTime=DateUtil.dateToym(time)
        String sqlname = "oms_com_income_stat_channel_day_" + monTime+"_"+MysqltableMod
        String sql = "DELETE FROM " + sqlname + " where user_id=" + "'" + userId + "'"
        return getOrderShardSql(userId).executeUpdate(sql)
    }
//清除月统计
    static Integer deleteMonthIncom(Integer userId,Date time) {

        String  monTime=DateUtil.dateToym(time)
        String sqlname = "oms_com_income_stat_channel_month_" + monTime
        String sql = "DELETE FROM " + sqlname + " where user_id=" + "'" + userId + "'"
        return getOrderShardSql(userId).executeUpdate(sql)
    }
    //清除全部统计
    static Integer deleteTotalIncom(Integer userId) {
        Integer MysqltableMod =SetUtil.Mod64(userId)
        String sqlname = "oms_com_income_stat_channel_total_" +MysqltableMod
        String sql = "DELETE FROM " + sqlname + " where user_id=" + "'" + userId + "'"
        return getOrderShardSql(userId).executeUpdate(sql)
    }

    //查询MySQL订单数据
    static List<Map> getFailOrderresult(Integer userid,String channel,String sourcestatus,String stime ) {
        String sqlname = "oms_com_income_result_" + stime
        String sql = "select * from " + sqlname + " where channel=" + "'" + channel + "'" + " and source_status =" + "'" + sourcestatus + "'"+ " and source like " + "'%"+userid +"%'"
        return miyuanOrderSql.rows(sql)
    }

//预估收益统计
    static Map getOrderItemCount (Integer userId,String channel,String starTime,String endTime){
        Integer MysqltableMod =SetUtil.Mod256(userId)
        String sqlname = "oms_com_income_item_"+MysqltableMod
        String sql  ="select count(1) as 'itemCunt' from "+sqlname + " where user_id="+ "'"+userId + "'"+"AND source_create_time >= "+"'"+starTime +"'"+"AND source_create_time < "+"'"+endTime +"'"+"AND channel = "+"'"+channel+"'"+"AND commission>0 "
        return getOrderShardSql(userId).firstRow(sql)
    }
    static Map getOrderItemCommission (Integer userId,String channel,String starTime,String endTime){
        Integer MysqltableMod =SetUtil.Mod256(userId)
        String sqlname = "oms_com_income_item_"+MysqltableMod
        String sql  ="select sum(commission) as 'itemCommission' from "+sqlname + " where user_id="+ "'"+userId + "'"+"AND source_create_time >= "+"'"+starTime +"'"+"AND source_create_time < "+"'"+endTime +"'"+"AND channel = "+"'"+channel+"'"
        return getOrderShardSql(userId).firstRow(sql)
    }
//结算订单MySQL明细统计SQL
    static Map getOrderSettleItemCount (Integer userId,String channel,String starTime,String endTime){
        Integer MysqltableMod =SetUtil.Mod256(userId)
        String sqlname = "oms_com_income_item_"+MysqltableMod
        String sql  ="select count(1) as 'itemCunt' from "+sqlname + " where user_id="+ "'"+userId + "'"+"AND source_settle_time >= "+"'"+starTime +"'"+"AND source_settle_time < "+"'"+endTime +"'"+"AND channel = "+"'"+channel+"'"+"AND commission>0 "+"AND status=3 "
        return getOrderShardSql(userId).firstRow(sql)
    }
    static Map getOrderSettleItemCommission (Integer userId,String channel,String starTime,String endTime){
        Integer MysqltableMod =SetUtil.Mod256(userId)
        String sqlname = "oms_com_income_item_"+MysqltableMod
        String sql  ="select sum(commission) as 'itemCommission' from "+sqlname + " where user_id="+ "'"+userId + "'"+"AND source_settle_time >= "+"'"+starTime +"'"+"AND source_settle_time < "+"'"+endTime +"'"+"AND channel = "+"'"+channel+"'"+"AND status=3 "
        return getOrderShardSql(userId).firstRow(sql)
    }

    static List<Map> getChannlDay(Integer userId,String channel,Date time) {
        Integer MysqltableMod =SetUtil.Mod32(userId)
        String  monTime=DateUtil.dateToym(time)
        String  dayTime=DateUtil.dateToymd(time)
        String sqlname = "oms_com_income_stat_channel_day_" + monTime+"_"+MysqltableMod
        String sql = "select * from " + sqlname + " where channel=" + "'" + channel + "'" + " and date_str =" + "'" + dayTime + "'"+ " and user_id= " + "'"+userId +"'"
        return getOrderShardSql(userId).rows(sql)
    }
    //查询某渠道日收益
    static Map getChannlStatDay(Integer userId,String channel,String statKey,Date time) {
        Integer MysqltableMod =SetUtil.Mod32(userId)
        String  monTime=DateUtil.dateToym(time)
        String  dayTime=DateUtil.dateToymd(time)
        String sqlname = "oms_com_income_stat_channel_day_" + monTime+"_"+MysqltableMod
        String sql = "select * from " + sqlname + " where channel=" + "'" + channel + "'" + " and date_str =" + "'" + dayTime + "'"+ " and user_id= " + "'"+userId +"'"+" and stat_key="+"'" +statKey+"'"
        return getOrderShardSql(userId).firstRow(sql)
    }

    //所有渠道日佣金统计
    static Map getOrderDayCommission (Integer userId,String statKey,Date time){
        Integer MysqltableMod =SetUtil.Mod32(userId)
        String  monTime=DateUtil.dateToym(time)
        String  dayTime=DateUtil.dateToymd(time)
        String sqlname = "oms_com_income_stat_channel_day_" + monTime+"_"+MysqltableMod
        String sql = "select sum(commission) as 'dayCommission' from " + sqlname + " where stat_key=" + "'" + statKey + "'" + " and date_str =" + "'" + dayTime + "'"+ " and user_id= " + "'"+userId +"'"
        return getOrderShardSql(userId).firstRow(sql)
    }
    //所有渠道日预估订单统计
    static Map getOrderDayCount (Integer userId,String statKey,Date time) {
        Integer MysqltableMod = SetUtil.Mod32(userId)
        String monTime = DateUtil.dateToym(time)
        String dayTime = DateUtil.dateToymd(time)
        String sqlname = "oms_com_income_stat_channel_day_" + monTime + "_" + MysqltableMod
        String sql = "select sum(count) as 'orderCout' from " + sqlname + " where stat_key=" + "'" + statKey + "'" + " and date_str =" + "'" + dayTime + "'" + " and user_id= " + "'" + userId + "'"
        return getOrderShardSql(userId).firstRow(sql)
    }
    //所有渠道月佣金统计
    static Map getOrderMonthCommission(Integer userId,String statKey,Date time) {
        String  monTime=DateUtil.dateToym(time)
        String sqlname = "oms_com_income_stat_channel_month_"+ monTime
        String sql = "select sum(commission) as 'monthCommission' from " + sqlname + " where stat_key=" + "'" + statKey + "'" + " and user_id= " + "'"+userId +"'"
        return getOrderShardSql(userId).firstRow(sql)


    }
    //所有渠道月订单统计
    static Map getOrderMonthCount(Integer userId,String statKey,Date time) {
        String monTime = DateUtil.dateToym(time)
        String sqlname = "oms_com_income_stat_channel_month_" + monTime
        String sql = "select sum(count) as 'monthCount' from " + sqlname + " where stat_key=" + "'" + statKey + "'" + " and user_id= " + "'" + userId + "'"
        return getOrderShardSql(userId).firstRow(sql)
    }

        //渠道月佣金统计
    static Map getChannelOrderMonthCommission(Integer userId,String channel,String statKey,Date time) {
        String  monTime=DateUtil.dateToym(time)
        String sqlname = "oms_com_income_stat_channel_month_"+ monTime
        String sql = "select sum(commission) as 'monthCommission' from " + sqlname + " where stat_key=" + "'" + statKey + "'" + " and user_id= " + "'"+userId +"'"+" and channel="+"'" +channel+"'"
        return getOrderShardSql(userId).firstRow(sql)


    }
    //渠道月订单统计
    static Map getChannelOrderMonthCount(Integer userId,String channel,String statKey,Date time) {
        String  monTime=DateUtil.dateToym(time)
        String sqlname = "oms_com_income_stat_channel_month_"+ monTime
        String sql = "select sum(count) as 'monthCount' from " + sqlname + " where stat_key=" + "'" + statKey + "'" + " and user_id= " + "'"+userId +"'"+" and channel="+"'" +channel+"'"
        return getOrderShardSql(userId).firstRow(sql)


    }

    static List<Map> getChannlMonth(Integer userId,String channel,Date time) {
        String  monTime=DateUtil.dateToym(time)
        String sqlname = "oms_com_income_stat_channel_month_"+ monTime
        String sql = "select * from " + sqlname + " where channel=" + "'" + channel + "'" + " and user_id= " + "'"+userId +"'"
        return getOrderShardSql(userId).rows(sql)


    }

    static List<Map> getChannlTotal(Integer userId,String channel) {
        Integer MysqltableMod =SetUtil.Mod64(userId)
        String sqlname = "oms_com_income_stat_channel_total_"+ MysqltableMod
        String sql = "select * from " + sqlname + " where channel=" + "'" + channel + "'" + " and user_id= " + "'"+userId +"'"
        return getOrderShardSql(userId).rows(sql)


    }



}
