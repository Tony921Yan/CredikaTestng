package com.miyuan.request.infra.order
import com.miyuan.com.TestContext
import com.miyuan.factory.InfraRequest
import com.miyuan.service.OrderService
import com.miyuan.service.RedisService
import com.miyuan.util.MoneyUtil
import com.miyuan.util.DateUtil

class getSimpleComNew extends InfraRequest {
    {
        super.api = "/api/order/getSimpleCom"
    }

    InfraRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    InfraRequest preInvoke(TestContext testContext) {
        String a = testContext.getResponse().code.toString()
        println(a)
        return this
    }

    InfraRequest baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        def commssionList = testContext.getResponse().data
        assert commssionList.size() == 3
        return this
    }

    // 佣金字段数值断言
    InfraRequest commissionAssert(TestContext testContext) {
        Calendar c = Calendar.getInstance()
        c.setTime(new Date())
        Date today =  c.getTime()
        String strToday = DateUtil.dateToymd(today)
        c.add(Calendar.MONTH, -1);
        Date precMonth = c.getTime()
        String EstimateKey ='CPS_ESTIMATE';
        String userId = testContext.get("userId").toString()
        Integer dBTodayEstimate = OrderService.getOrderDayCommission(Integer.parseInt(userId),EstimateKey,today).dayCommission
        Integer dBThisMonthEstimate = OrderService.getOrderMonthCommission(Integer.parseInt(userId),EstimateKey,today).monthCommission
        Integer dBPrecMonthEstimate = OrderService.getOrderMonthCommission(Integer.parseInt(userId),EstimateKey,precMonth).monthCommission
        def commissionList = testContext.getResponse().data
        // 获取缓存数据
        String redisSimpleComkey = "str:simple-com:"+strToday+":"+userId
        Object SimpleCom= RedisService.getcommis(redisSimpleComkey)
        println(SimpleCom)
        //今日预估和MySQL 今日预估断言
        if(dBTodayEstimate == null){
            assert MoneyUtil.changeY2F(commissionList.get("todayEstimate").toString())==0
        }else{
            assert MoneyUtil.changeY2F(commissionList.get("todayEstimate").toString())==dBTodayEstimate
        }
        //本月预估和MySQL 本月预估断言
        if(dBThisMonthEstimate == null){
            assert MoneyUtil.changeY2F(commissionList.get("thisMonthEstimate").toString())==0
        }else{

            assert MoneyUtil.changeY2F(commissionList.get("thisMonthEstimate").toString())==dBThisMonthEstimate
        }

        //上月预估和MySQL 上月月预估断言
        if(dBPrecMonthEstimate == null){
            assert MoneyUtil.changeY2F(commissionList.get("prevMonthEstimate").toString())==0
        }else{
            assert MoneyUtil.changeY2F(commissionList.get("prevMonthEstimate").toString())==dBPrecMonthEstimate
        }


    }



}
