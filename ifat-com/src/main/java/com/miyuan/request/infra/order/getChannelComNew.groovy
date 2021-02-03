package com.miyuan.request.infra.order


import com.miyuan.com.TestContext
import com.miyuan.factory.InfraRequest
import com.miyuan.service.OrderService
import com.miyuan.service.RedisService
import com.miyuan.util.DateUtil
import com.miyuan.util.JsonUtil
import com.miyuan.util.MoneyUtil

class getChannelComNew extends InfraRequest {
    {
        super.api = "/api/order/getTypeChannelCom"
        super.params = ["type"]
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
        def commssionList = testContext.getResponse().data.channelItems
        assert commssionList.size() == 12
        return this
    }

    InfraRequest DayCommissionAssert(TestContext testContext) {
        String type = testContext.type.toString()
        Calendar c = Calendar.getInstance()
        c.setTime(new Date())
        Date today = c.getTime()
        Date todayRedis = c.getTime()
        String strToday = DateUtil.dateToymd(todayRedis)
        if(type =='1'){
            today = c.getTime()

        }else if(type =='2') {
            today= DateUtil.dateAdd(today,Calendar.DATE,-1)
            println("昨天："+today)
        }
        String EstimateKey = 'CPS_ESTIMATE'
        String settleKey = 'CPS_SETTLE'
        String userId = testContext.get("userId").toString()
        Integer dBTodayEstimate = OrderService.getOrderDayCommission(Integer.parseInt(userId), EstimateKey, today).dayCommission
        Integer dBTodaySettle = OrderService.getOrderDayCommission(Integer.parseInt(userId), settleKey, today).dayCommission
        Integer dBTodaycount = OrderService.getOrderDayCount(Integer.parseInt(userId), EstimateKey, today).orderCout
        def commissionList = testContext.getResponse().data
        // 获取缓存数据
        String redisTypeComkey = "str:type-com:"+strToday+":"+userId+":"+type
        println(redisTypeComkey)
        String typeCom= RedisService.getcommis(redisTypeComkey)
        def typeComJson = JsonUtil.strJsonToJson(typeCom)
        Integer redisCount =typeComJson.count
        String redisEstimate =typeComJson.estimate
        String redisSettle =typeComJson.settle
        def RedisChannelItemsList =typeComJson.channelItems
        println(typeComJson)

        //接口数据校验
        if(commissionList.get("count")== 0){
            assert dBTodaycount==null
            assert dBTodayEstimate== null
            assert redisCount==0
            assert  redisEstimate=='0'

        }else{
            //今日订单数和MySQL,redis 订单数断言
            assert commissionList.get("count") == dBTodaycount
            assert commissionList.get("count") ==redisCount
            //今日预估和MySQL 今日预估断言
            assert MoneyUtil.changeY2F(commissionList.get("estimate").toString()) == dBTodayEstimate
            assert commissionList.get("estimate").toString()==redisEstimate
        }
        if(commissionList.get("settle") =='0'){
            assert dBTodaySettle== null
            assert redisSettle=='0'
        }else {
            //今日结算和MySQL ,redis今日预估断言
            assert MoneyUtil.changeY2F(commissionList.get("settle").toString()) == dBTodaySettle
            assert commissionList.get("settle").toString()==redisSettle
        }


        List channelCommissionList = testContext.getResponse().data.channelItems
        channelCommissionList.stream().forEach { channelCommission ->
            String channel = channelCommission.getAt("channel")
            switch (channel) {
                case 'TB':
                    Integer TBcount = channelCommission.get("count")
                    Integer TBestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer TBsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    //获取Redis数据
                    Integer RedisTBCount=RedisChannelItemsList.get(0).count
                    Integer RedisTBEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(0).estimate.toString())
                    Integer RedisTBSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(0).settle.toString())
                    if(TBcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert RedisTBCount ==0
                        assert RedisTBEstimate==0
                        println("淘宝预估收益为0")
                    }else {
                        Integer dbTBcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbTBestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert TBcount == dbTBcout
                        assert TBestimate == dbTBestimate
                        assert TBcount==RedisTBCount
                        assert TBestimate==RedisTBEstimate
                    }
                    if(TBsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert RedisTBSettle == 0
                        println("淘宝结算收益为0")
                    }else {
                        Integer dbTBsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert TBsettle == dbTBsettle
                        assert TBsettle == RedisTBSettle
                    }
                    break;
                case 'JD':
                    Integer JDcount = channelCommission.get("count")
                    Integer JDestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer JDsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    //获取Redis数据
                    Integer RedisJDCount=RedisChannelItemsList.get(1).count
                    Integer RedisJDEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(1).estimate.toString())
                    Integer RedisJDSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(1).settle.toString())
                    if(JDcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert  RedisJDCount==0
                        assert  RedisJDEstimate ==0
                        println("京东预估收益为0")
                    }else {
                        Integer dbJDcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbJDestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert JDcount == dbJDcout
                        assert JDestimate == dbJDestimate
                        assert  RedisJDCount==JDcount
                        assert  RedisJDEstimate ==JDestimate
                    }
                    if(JDsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert  RedisJDSettle ==0
                        println("京东结算收益为0")
                    }else {
                        Integer dbJDsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert JDsettle == dbJDsettle
                        assert JDsettle ==RedisJDSettle
                    }
                    break;
                case 'PDD':
                    Integer PDDcount = channelCommission.get("count")
                    Integer PDDestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer PDDsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    //获取Redis数据
                    Integer RedisPDDCount=RedisChannelItemsList.get(2).count
                    Integer RedisPDDEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(2).estimate.toString())
                    Integer RedisPDDSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(2).settle.toString())
                    if(PDDcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert RedisPDDCount ==0
                        assert RedisPDDEstimate==0
                        println("拼多多预估收益为0")
                    }else {
                        Integer dbPDDcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbPDDestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert PDDcount == dbPDDcout
                        assert PDDestimate == dbPDDestimate
                        assert PDDcount==RedisPDDCount
                        assert PDDestimate==RedisPDDEstimate
                    }
                    if(PDDsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert RedisPDDSettle == 0
                        println("拼多多结算收益为0")
                    }else {
                        Integer dbPDDsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert PDDsettle == dbPDDsettle
                        assert PDDsettle == RedisPDDSettle
                    }
                        break;
                case 'WPH':
                    Integer WPHcount = channelCommission.get("count")
                    Integer WPHestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer WPHsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    //获取Redis数据
                    Integer RedisWPHCount=RedisChannelItemsList.get(3).count
                    Integer RedisWPHEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(3).estimate.toString())
                    Integer RedisWPHSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(3).settle.toString())
                    if(WPHcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert RedisWPHCount ==0
                        assert RedisWPHEstimate==0
                        println("唯品会预估收益为0")
                    }else {
                        Integer dbWPHcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbWPHestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert WPHcount == dbWPHcout
                        assert WPHestimate == dbWPHestimate
                        assert WPHcount==RedisWPHCount
                        assert WPHestimate==RedisWPHEstimate
                    }
                    if(WPHsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert RedisWPHSettle == 0
                        println("唯品会结算收益为0")
                    }else {
                        Integer dbWPHsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert WPHsettle == dbWPHsettle
                        assert WPHsettle == RedisWPHSettle
                    }
                    break;
                case'SN':
                    Integer SNcount = channelCommission.get("count")
                    Integer SNestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer SNsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    //获取Redis数据
                    Integer RedisSNCount=RedisChannelItemsList.get(4).count
                    Integer RedisSNEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(4).estimate.toString())
                    Integer RedisSNSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(4).settle.toString())
                    if(SNcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert RedisSNCount ==0
                        assert RedisSNEstimate==0
                        println("苏宁预估收益为0")
                    }else {
                        Integer dbSNcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbSNestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert SNcount == dbSNcout
                        assert SNestimate == dbSNestimate
                        assert SNcount==RedisSNCount
                        assert SNestimate==RedisSNEstimate
                    }
                    if(SNsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert RedisSNSettle == 0
                        println("苏宁结算收益为0")
                    }else {
                        Integer dbSNsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert SNsettle == dbSNsettle
                        assert SNsettle == RedisSNSettle
                    }
                    break;
                case'KL':
                    Integer KLcount = channelCommission.get("count")
                    Integer KLestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer KLsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    //获取Redis数据
                    Integer RedisKLCount=RedisChannelItemsList.get(5).count
                    Integer RedisKLEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(5).estimate.toString())
                    Integer RedisKLSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(5).settle.toString())
                    if(KLcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert RedisKLCount ==0
                        assert RedisKLEstimate==0
                        println("考拉预估收益为0")
                    }else {
                        Integer dbKLcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbKLestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert KLcount == dbKLcout
                        assert KLestimate == dbKLestimate
                        assert KLcount==RedisKLCount
                        assert KLestimate==RedisKLEstimate
                    }
                    if(KLsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert RedisKLSettle == 0
                        println("考拉结算收益为0")
                    }else {

                        Integer dbKLsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert KLsettle == dbKLsettle
                        assert KLsettle == RedisKLSettle
                    }
                    break;
                case'MT':
                    Integer MTcount = channelCommission.get("count")
                    Integer MTestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer MTsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    //获取Redis数据
                    Integer RedisMTCount=RedisChannelItemsList.get(6).count
                    Integer RedisMTEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(6).estimate.toString())
                    Integer RedisMTSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(6).settle.toString())
                    if(MTcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert RedisMTCount ==0
                        assert RedisMTEstimate==0
                        println("美团预估收益为0")
                    }else {
                        Integer dbMTcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbMTestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert MTcount == dbMTcout
                        assert MTestimate == dbMTestimate
                        assert MTcount==RedisMTCount
                        assert MTestimate==RedisMTEstimate
                    }
                    if(MTsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert RedisMTSettle == 0
                        println("美团结算收益为0")
                    }else {
                        Integer dbMTsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert MTsettle == dbMTsettle
                        assert MTsettle == RedisMTSettle
                    }
                    break;
                case'MTDP':
                    Integer MTDPcount = channelCommission.get("count")
                    Integer MTDPestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer MTDPsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    //获取Redis数据
                    Integer RedisMTDPCount=RedisChannelItemsList.get(7).count
                    Integer RedisMTDPEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(7).estimate.toString())
                    Integer RedisMTDPSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(7).settle.toString())
                    if(MTDPcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert RedisMTDPCount ==0
                        assert RedisMTDPEstimate==0
                        println("美团点评预估收益为0")
                    }else {
                        Integer dbMTDPcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbMTDPestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert MTDPcount == dbMTDPcout
                        assert MTDPestimate == dbMTDPestimate
                        assert MTDPcount==RedisMTDPCount
                        assert MTDPestimate==RedisMTDPEstimate
                    }
                    if(MTDPsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert RedisMTDPSettle == 0
                        println("美团点评结算收益为0")
                    }else {
                        Integer dbMTDPsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert MTDPsettle == dbMTDPsettle
                        assert MTDPsettle == RedisMTDPSettle
                    }
                    break;
                case'XC':
                    Integer XCcount = channelCommission.get("count")
                    Integer XCestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer XCsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    //获取Redis数据
                    Integer RedisXCCount=RedisChannelItemsList.get(8).count
                    Integer RedisXCEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(8).estimate.toString())
                    Integer RedisXCSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(8).settle.toString())
                    if(XCcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert RedisXCCount ==0
                        assert RedisXCEstimate==0
                        println("携程预估收益为0")
                    }else {
                        Integer dbXCcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbXCestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert XCcount == dbXCcout
                        assert XCestimate == dbXCestimate
                        assert XCcount==RedisXCCount
                        assert XCestimate==RedisXCEstimate
                    }
                    if(XCsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert RedisXCSettle == 0
                        println("携程结算收益为0")
                    }else {
                        Integer dbXCsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert XCsettle == dbXCsettle
                        assert XCsettle == RedisXCSettle
                    }
                    break;
                case'HUAWEI':
                    Integer HUAWEIcount = channelCommission.get("count")
                    Integer HUAWEIestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer HUAWEIsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())

                    //获取Redis数据
                    Integer RedisHUAWEICount=RedisChannelItemsList.get(9).count
                    Integer RedisHUAWEIEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(9).estimate.toString())
                    Integer RedisHUAWEISettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(9).settle.toString())
                    if(HUAWEIcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert RedisHUAWEICount ==0
                        assert RedisHUAWEIEstimate==0
                        println("华为预估收益为0")
                    }else {
                        Integer dbHUAWEIcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbHUAWEIestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert HUAWEIcount == dbHUAWEIcout
                        assert HUAWEIestimate == dbHUAWEIestimate
                        assert HUAWEIcount==RedisHUAWEICount
                        assert HUAWEIestimate==RedisHUAWEIEstimate
                    }
                    if(HUAWEIsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert RedisHUAWEISettle == 0
                        println("华为结算收益为0")
                    }else {
                        Integer dbHUAWEIsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert HUAWEIsettle == dbHUAWEIsettle
                        assert HUAWEIsettle == RedisHUAWEISettle
                    }
                    break;
                case'KDF':
                    Integer KDFcount = channelCommission.get("count")
                    Integer KDFestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer KDFsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())

                    //获取Redis数据
                    Integer RedisKDFCount=RedisChannelItemsList.get(10).count
                    Integer RedisKDFEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(10).estimate.toString())
                    Integer RedisKDFSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(10).settle.toString())
                    if(KDFcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert RedisKDFCount ==0
                        assert RedisKDFEstimate==0
                        println("信用卡预估收益为0")
                    }else {
                        Integer dbKDFcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbKDFestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert KDFcount == dbKDFcout
                        assert KDFestimate == dbKDFestimate
                        assert KDFcount==RedisKDFCount
                        assert KDFestimate==RedisKDFEstimate
                    }
                    if(KDFsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert RedisKDFSettle == 0
                        println("信用卡结算收益为0")
                    }else {
                        Integer dbKDFsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert KDFsettle == dbKDFsettle
                        assert KDFsettle == RedisKDFSettle
                    }
                    break;
                case'YK':
                    Integer YKcount = channelCommission.get("count")
                    Integer YKestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer YKsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())

                    //获取Redis数据
                    Integer RedisYKCount=RedisChannelItemsList.get(4).count
                    Integer RedisYKEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(4).estimate.toString())
                    Integer RedisYKSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(4).settle.toString())
                    if(YKcount==0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today) == null
                        assert RedisYKCount ==0
                        assert RedisYKEstimate==0
                        println("优酷预估收益为0")
                    }else {
                        Integer dbYKcout = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).count
                        Integer dbYKestimate = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,EstimateKey,today).commission
                        assert YKcount == dbYKcout
                        assert YKestimate == dbYKestimate
                        assert YKcount==RedisYKCount
                        assert YKestimate==RedisYKEstimate
                    }
                    if(YKsettle == 0){
                        assert OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today) == null
                        assert RedisYKSettle == 0
                        println("优酷结算收益为0")
                    }else {
                        Integer dbYKsettle  = OrderService.getChannlStatDay(Integer.parseInt(userId),channel,settleKey,today).commission
                        assert YKsettle == dbYKsettle
                        assert YKsettle == RedisYKSettle
                    }
                    break;
                        default:
                        println("渠道不匹配");
                    }

    }

    }

    InfraRequest MonthCommissionAssert(TestContext testContext) {
        String type = testContext.type.toString()
        Calendar c = Calendar.getInstance()
        c.setTime(new Date())
        Date month = c.getTime()
        Date todayRedis = c.getTime()
        String strToday = DateUtil.dateToymd(todayRedis)
        if(type =='3'){
            month = c.getTime()

        }else if(type =='4') {
            month= DateUtil.dateAdd(month,Calendar.MONTH,-1)
            println("上月："+month)
        }
        String EstimateKey = 'CPS_ESTIMATE'
        String settleKey = 'CPS_SETTLE'
        String userId = testContext.get("userId").toString()
        Integer dBMonthEstimate = OrderService.getOrderMonthCommission(Integer.parseInt(userId), EstimateKey, month).monthCommission
        Integer dBMonthSettle = OrderService.getOrderMonthCommission(Integer.parseInt(userId), settleKey, month).monthCommission
       Integer dBMonthcount = OrderService.getOrderMonthCount(Integer.parseInt(userId), EstimateKey, month).monthCount
        def commissionList = testContext.getResponse().data
        // 获取缓存数据
        String redisTypeComkey = "str:type-com:"+strToday+":"+userId+":"+type
        println(redisTypeComkey)
        String typeCom= RedisService.getcommis(redisTypeComkey)
        def typeComJson = JsonUtil.strJsonToJson(typeCom)
        Integer redisCount =typeComJson.count
        String redisEstimate =typeComJson.estimate
        String redisSettle =typeComJson.settle
        def RedisChannelItemsList =typeComJson.channelItems
        println(typeComJson)

        //接口数据校验
        if(commissionList.get("count")== 0){
            assert dBMonthEstimate==null
            assert dBMonthcount== null
            assert redisCount==0
            assert  redisEstimate=='0'
        }else{
            //今日订单数和MySQL 订单数断言
            assert commissionList.get("count") == dBMonthcount
            assert commissionList.get("count") == redisCount
            //今日预估和MySQL 今日预估断言
            assert MoneyUtil.changeY2F(commissionList.get("estimate").toString()) == dBMonthEstimate
            assert commissionList.get("estimate").toString() == redisEstimate
        }

        if(commissionList.get("settle") =='0'){
            assert dBMonthSettle== null
            assert redisSettle == '0'
        }else {
            //今日结算和MySQL 今日预估断言
            assert MoneyUtil.changeY2F(commissionList.get("settle").toString()) == dBMonthSettle
            assert commissionList.get("settle").toString() == redisSettle
        }


        List channelCommissionList = testContext.getResponse().data.channelItems
        channelCommissionList.stream().forEach { channelCommission ->
            String channel = channelCommission.getAt("channel")
            switch (channel) {
                case 'TB':
                    Integer TBcount = channelCommission.get("count")
                    Integer TBestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer TBsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbTBcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbTBestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbTBsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisTBCount=RedisChannelItemsList.get(0).count
                    Integer RedisTBEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(0).estimate.toString())
                    Integer RedisTBSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(0).settle.toString())
                    if (TBcount == 0) {
                        assert dbTBestimate == null
                        assert  RedisTBCount ==0
                        assert  RedisTBEstimate == 0
                        println("淘宝预估收益为0")
                    } else {

                       assert TBcount == dbTBcout
                        assert TBestimate == dbTBestimate
                        assert  TBcount == RedisTBCount
                        assert TBestimate == RedisTBEstimate

                    }
                    if (TBsettle == 0) {
                        assert dbTBsettle == null
                        assert RedisTBSettle == 0
                        println("淘宝结算收益为0")
                    } else {

                        assert TBsettle == dbTBsettle
                        assert TBsettle == RedisTBSettle
                    }
                    break;
                case 'JD':
                    Integer JDcount = channelCommission.get("count")
                    Integer JDestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer JDsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbJDcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbJDestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbJDsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisJDCount=RedisChannelItemsList.get(1).count
                    Integer RedisJDEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(1).estimate.toString())
                    Integer RedisJDSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(1).settle.toString())
                    if (JDcount == 0) {
                        assert dbJDestimate == null
                        assert  RedisJDCount ==0
                        assert  RedisJDEstimate == 0
                        println("京东预估收益为0")
                    } else {

                        assert JDcount == dbJDcout
                        assert JDestimate == dbJDestimate
                        assert  JDcount == RedisJDCount
                        assert JDestimate == RedisJDEstimate
                    }
                    if (JDsettle == 0) {
                        assert dbJDsettle == null
                        assert RedisJDSettle == 0
                        println("京东结算收益为0")
                    } else {

                        assert JDsettle == dbJDsettle
                        assert JDsettle == RedisJDSettle
                    }
                    break;
                case 'PDD':
                    Integer PDDcount = channelCommission.get("count")
                    Integer PDDestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer PDDsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbPDDcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbPDDestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbPDDsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisPDDCount=RedisChannelItemsList.get(2).count
                    Integer RedisPDDEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(2).estimate.toString())
                    Integer RedisPDDSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(2).settle.toString())
                    if (PDDcount == 0) {
                        assert dbPDDestimate == null
                        assert  RedisPDDCount ==0
                        assert  RedisPDDEstimate == 0
                        println("拼多多预估收益为0")
                    } else {
                        assert PDDcount == dbPDDcout
                        assert PDDestimate == dbPDDestimate
                        assert  PDDcount == RedisPDDCount
                        assert PDDestimate == RedisPDDEstimate
                    }
                    if (PDDsettle == 0) {
                        assert dbPDDsettle == null
                        assert RedisPDDSettle == 0
                        println("拼多多结算收益为0")
                    } else {

                        assert PDDsettle == dbPDDsettle
                        assert PDDsettle == RedisPDDSettle
                    }
                    break;
                case 'WPH':
                    Integer WPHcount = channelCommission.get("count")
                    Integer WPHestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer WPHsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbWPHcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbWPHestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbWPHsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisWPHCount=RedisChannelItemsList.get(3).count
                    Integer RedisWPHEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(3).estimate.toString())
                    Integer RedisWPHSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(3).settle.toString())
                    if (WPHcount == 0) {
                        assert dbWPHestimate == null
                        assert  RedisWPHCount ==0
                        assert  RedisWPHEstimate == 0
                        println("唯品会预估收益为0")
                    } else {

                        assert WPHcount == dbWPHcout
                        assert WPHestimate == dbWPHestimate
                        assert  WPHcount == RedisWPHCount
                        assert WPHestimate == RedisWPHEstimate
                    }
                    if (WPHsettle == 0) {
                        assert dbWPHsettle == null
                        assert RedisWPHSettle == 0
                        println("唯品会结算收益为0")
                    } else {

                        assert WPHsettle == dbWPHsettle
                        assert WPHsettle == RedisWPHSettle
                    }
                    break;
                case 'SN':
                    Integer SNcount = channelCommission.get("count")
                    Integer SNestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer SNsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbSNcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbSNestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbSNsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisSNCount=RedisChannelItemsList.get(4).count
                    Integer RedisSNEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(4).estimate.toString())
                    Integer RedisSNSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(4).settle.toString())
                    if (SNcount == 0) {
                        assert dbSNestimate == null
                        assert  RedisSNCount ==0
                        assert  RedisSNEstimate == 0
                        println("苏宁预估收益为0")
                    } else {
                        assert SNcount == dbSNcout
                        assert SNestimate == dbSNestimate
                        assert  SNcount == RedisSNCount
                        assert SNestimate == RedisSNEstimate
                    }
                    if (SNsettle == 0) {
                        assert dbSNsettle == null
                        assert RedisSNSettle == 0
                        println("苏宁结算收益为0")
                    } else {

                        assert SNsettle == dbSNsettle
                        assert SNsettle == RedisSNSettle
                    }
                    break;

                case 'KL':
                    Integer KLcount = channelCommission.get("count")
                    Integer KLestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer KLsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbKLcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbKLestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbKLsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisKLCount=RedisChannelItemsList.get(5).count
                    Integer RedisKLEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(5).estimate.toString())
                    Integer RedisKLSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(5).settle.toString())
                    if (KLcount == 0) {
                        assert dbKLestimate == null
                        assert  RedisKLCount ==0
                        assert  RedisKLEstimate == 0
                        println("考拉预估收益为0")
                    } else {
                        assert KLcount == dbKLcout
                        assert KLestimate == dbKLestimate
                        assert  KLcount == RedisKLCount
                        assert KLestimate == RedisKLEstimate
                    }
                    if (KLsettle == 0) {
                        assert dbKLsettle == null
                        assert RedisKLSettle == 0
                        println("考拉结算收益为0")
                    } else {

                        assert KLsettle == dbKLsettle
                        assert KLsettle == RedisKLSettle
                    }
                    break;
                case 'MT':
                    Integer MTcount = channelCommission.get("count")
                    Integer MTestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer MTsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbMTcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbMTestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbMTsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisMTCount=RedisChannelItemsList.get(6).count
                    Integer RedisMTEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(6).estimate.toString())
                    Integer RedisMTSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(6).settle.toString())
                    if (MTcount == 0) {
                        assert dbMTestimate == null
                        assert  RedisMTCount ==0
                        assert  RedisMTEstimate == 0
                        println("美团预估收益为0")
                    } else {
                        assert MTcount == dbMTcout
                        assert MTestimate == dbMTestimate
                        assert  MTcount == RedisMTCount
                        assert MTestimate == RedisMTEstimate
                    }
                    if (MTsettle == 0) {
                        assert dbMTsettle == null
                        assert RedisMTSettle == 0
                        println("美团结算收益为0")
                    } else {

                        assert MTsettle == dbMTsettle
                        assert MTsettle == RedisMTSettle
                    }
                    break;
                case 'MTDP':
                    Integer MTDPcount = channelCommission.get("count")
                    Integer MTDPestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer MTDPsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbMTDPcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbMTDPestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbMTDPsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisMTDPCount=RedisChannelItemsList.get(7).count
                    Integer RedisMTDPEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(7).estimate.toString())
                    Integer RedisMTDPSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(7).settle.toString())
                    if (MTDPcount == 0) {
                        assert dbMTDPestimate == null
                        assert  RedisMTDPCount ==0
                        assert  RedisMTDPEstimate == 0
                        println("美团点评预估收益为0")
                    } else {
                        assert MTDPcount == dbMTDPcout
                        assert MTDPestimate == dbMTDPestimate
                        assert  MTDPcount == RedisMTDPCount
                        assert MTDPestimate == RedisMTDPEstimate
                    }
                    if (MTDPsettle == 0) {
                        assert dbMTDPsettle == null
                        assert RedisMTDPSettle == 0
                        println("美团点评结算收益为0")
                    } else {

                        assert MTDPsettle == dbMTDPsettle
                        assert MTDPsettle == RedisMTDPSettle
                    }
                    break;
                case 'XC':
                    Integer XCcount = channelCommission.get("count")
                    Integer XCestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer XCsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbXCcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbXCestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbXCsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisXCCount=RedisChannelItemsList.get(8).count
                    Integer RedisXCEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(8).estimate.toString())
                    Integer RedisXCSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(8).settle.toString())
                    if (XCcount == 0) {
                        assert dbXCestimate == null
                        assert  RedisXCCount ==0
                        assert  RedisXCEstimate == 0
                        println("携程预估收益为0")
                    } else {

                        assert XCcount == dbXCcout
                        assert XCestimate == dbXCestimate
                        assert  XCcount == RedisXCCount
                        assert XCestimate == RedisXCEstimate

                    }
                    if (XCsettle == 0) {
                        assert dbXCsettle == null
                        assert RedisXCSettle == 0
                        println("携程结算收益为0")
                    } else {

                        assert XCsettle == dbXCsettle
                        assert XCsettle == RedisXCSettle
                    }
                    break;
                case 'HUAWEI':
                    Integer HUAWEIcount = channelCommission.get("count")
                    Integer HUAWEIestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer HUAWEIsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbHUAWEIcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbHUAWEIestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbHUAWEIsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisHUAWEICount=RedisChannelItemsList.get(9).count
                    Integer RedisHUAWEIEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(9).estimate.toString())
                    Integer RedisHUAWEISettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(9).settle.toString())
                    if (HUAWEIcount == 0) {
                        assert dbHUAWEIestimate == null
                        assert  RedisHUAWEICount ==0
                        assert  RedisHUAWEIEstimate == 0
                        println("华为预估收益为0")
                    } else {

                        assert HUAWEIcount == dbHUAWEIcout
                        assert HUAWEIestimate == dbHUAWEIestimate
                        assert  HUAWEIcount == RedisHUAWEICount
                        assert HUAWEIestimate == RedisHUAWEIEstimate

                    }
                    if (HUAWEIsettle == 0) {
                        assert dbHUAWEIsettle == null
                        assert RedisHUAWEISettle == 0
                        println("华为结算收益为0")
                    } else {

                        assert HUAWEIsettle == dbHUAWEIsettle
                        assert HUAWEIsettle == RedisHUAWEISettle
                    }
                    break;
                case 'KDF':
                    Integer KDFcount = channelCommission.get("count")
                    Integer KDFestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer KDFsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbKDFcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbKDFestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbKDFsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisKDFCount=RedisChannelItemsList.get(10).count
                    Integer RedisKDFEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(10).estimate.toString())
                    Integer RedisKDFSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(10).settle.toString())
                    if (KDFcount == 0) {
                        assert dbKDFestimate == null
                        assert  RedisKDFCount ==0
                        assert  RedisKDFEstimate == 0
                        println("信用卡预估收益为0")
                    } else {

                        assert KDFcount == dbKDFcout
                        assert KDFestimate == dbKDFestimate
                        assert  KDFcount == RedisKDFCount
                        assert KDFestimate == RedisKDFEstimate

                    }
                    if (KDFsettle == 0) {
                        assert dbKDFsettle == null
                        assert RedisKDFSettle == 0
                        println("信用卡结算收益为0")
                    } else {

                        assert KDFsettle == dbKDFsettle
                        assert KDFsettle == RedisKDFSettle
                    }
                    break;
                case 'YK':
                    Integer YKcount = channelCommission.get("count")
                    Integer YKestimate = MoneyUtil.changeY2F(channelCommission.get("estimate").toString())
                    Integer YKsettle = MoneyUtil.changeY2F(channelCommission.get("settle").toString())
                    Integer dbYKcout = OrderService.getChannelOrderMonthCount(Integer.parseInt(userId), channel, EstimateKey, month).monthCount
                    Integer dbYKestimate = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, EstimateKey, month).monthCommission
                    Integer dbYKsettle = OrderService.getChannelOrderMonthCommission(Integer.parseInt(userId), channel, settleKey, month).monthCommission
                    //获取Redis数据
                    Integer RedisYKCount=RedisChannelItemsList.get(11).count
                    Integer RedisYKEstimate=MoneyUtil.changeY2F(RedisChannelItemsList.get(11).estimate.toString())
                    Integer RedisYKSettle=MoneyUtil.changeY2F(RedisChannelItemsList.get(11).settle.toString())
                    if (YKcount == 0) {
                        assert dbYKestimate == null
                        assert  RedisYKCount ==0
                        assert  RedisYKEstimate == 0
                        println("优酷预估收益为0")
                    } else {

                        assert YKcount == dbYKcout
                        assert YKestimate == dbYKestimate
                        assert  YKcount == RedisYKCount
                        assert YKestimate == RedisYKEstimate

                    }
                    if (YKsettle == 0) {
                        assert dbYKsettle == null
                        assert RedisYKSettle == 0
                        println("优酷结算收益为0")
                    } else {

                        assert YKsettle == dbYKsettle
                        assert YKsettle == RedisYKSettle
                    }
                    break;
                default:
                    println("渠道不匹配");

            }
        }
    }

}
