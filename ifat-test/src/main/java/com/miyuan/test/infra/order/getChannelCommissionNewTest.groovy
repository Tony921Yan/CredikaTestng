package com.miyuan.test.infra.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.user.getUserPageDate
import com.miyuan.request.infra.order.getChannelComNew
import com.miyuan.request.infra.order.getSimpleComNew
import org.testng.annotations.Test

class getChannelCommissionNewTest extends BaseTest{
    getChannelComNew getChannelComNew = new getChannelComNew()
    getSimpleComNew getSimpleComNew = new getSimpleComNew()
    getUserPageDate getUserPageDate = new getUserPageDate()
    @Test(description = "查询新架构收益" ,groups = ["uat","uat03"],testName = "simpleCommission",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCommissionNewSuccess(TestContext testContext){
        getSimpleComNew.invoke(testContext)
        getSimpleComNew.baseAssert(testContext)
        getSimpleComNew.commissionAssert(testContext)

    }
    @Test(description = "查询新架构渠道今天收益" ,groups = ["uat","uat03"],testName = "todayCommission",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelTodayCommissionNewSuccess(TestContext testContext){
        getChannelComNew.invoke(testContext)
        getChannelComNew.baseAssert(testContext)
        getChannelComNew.DayCommissionAssert(testContext)


    }
    @Test(description = "查询新架构渠道昨天收益" ,groups = ["uat","uat03"],testName = "yesterdayCommission",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelYesterdayCommissionNewSuccess(TestContext testContext){
        getChannelComNew.invoke(testContext)
        getChannelComNew.baseAssert(testContext)
        getChannelComNew.DayCommissionAssert(testContext)
    }
    @Test(description = "查询新架构渠道本月收益" ,groups = ["uat","uat03"],testName = "thisMonthCommission",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelThisMonthCommissionNewSuccess(TestContext testContext){
        getChannelComNew.invoke(testContext)
        getChannelComNew.baseAssert(testContext)
        getChannelComNew.MonthCommissionAssert(testContext)
    }
    @Test(description = "查询新架构渠道上月月收益" ,groups = ["uat","uat03"],testName = "yeMonthCommission",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelYeMonthCommissionNewSuccess(TestContext testContext){
        getChannelComNew.invoke(testContext)
        getChannelComNew.baseAssert(testContext)
        getChannelComNew.MonthCommissionAssert(testContext)
    }
    @Test(description = "查询新旧简版收益" ,groups = ["uat","uat03"],testName = "simpleCommission",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOldNewSimpleIcomeSuccess(TestContext testContext){
      // 旧接口
        getUserPageDate.invoke(testContext)
        getUserPageDate.baseAssert(testContext)
       def icomeinfoList = testContext.getResponse().data.incomeInfo
        String todayAllEstimateMoney =icomeinfoList.getAt("todayAllEstimateMoney").toString()
        String thisMonthAllEstimateMoney =icomeinfoList.getAt("thisMonthAllEstimateMoney").toString()
        String lastMonthAllEstimateMoney =icomeinfoList.getAt("lastMonthAllEstimateMoney").toString()

        //新接口
        getSimpleComNew.invoke(testContext)
       def simpleComList = testContext.getResponse().data
        String todayEstimate =simpleComList.getAt("todayEstimate").toString()
        String thisMonthEstimate =simpleComList.getAt("thisMonthEstimate").toString()
        String prevMonthEstimate =simpleComList.getAt("prevMonthEstimate").toString()
println(todayEstimate)


        //新旧接口数值对比
        assert todayAllEstimateMoney==todayEstimate
        assert  thisMonthAllEstimateMoney==thisMonthEstimate
        assert lastMonthAllEstimateMoney==prevMonthEstimate


    }

}


