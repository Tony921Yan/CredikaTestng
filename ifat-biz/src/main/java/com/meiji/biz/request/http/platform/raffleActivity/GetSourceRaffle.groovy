package com.meiji.biz.request.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException
class GetSourceRaffle extends PlatformPost{
    {
        super.api = "ActiveMainManage/getSourceRaffle"
        super.params = []
    }

    GetSourceRaffle invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSourceRaffle baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetSourceRaffle afterInvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data
        if(apiResult.separatePage==null){
            println("暂无独立承载页抽奖活动")
            throw new SkipException("暂无独立承载页抽奖活动")
        }
//        else if (apiResult.paymentPage==null){
//            println("暂无支付页面抽奖活动")
//            throw new SkipException("暂无支付页面抽奖活动")
//        }

        else if(apiResult.memberPage==null){
            println("暂无天天抽奖活动")
            throw new SkipException("暂无天天抽奖活动")
        }
        else if (apiResult.integralCenterPage==null){
            println("暂无积分抽奖活动")
            throw new SkipException("暂无积分抽奖活动")
        }
        else if(apiResult.integralPage==null){
            println("暂无积分抽奖独立页配置活动")
            throw new SkipException(testContext)
        }
        testContext.put("separatePageRaffleId",apiResult.separatePage.get("activeId"))
//        testContext.put("paymentPageRaffleId",apiResult.paymentPage.get("activeId"))
        testContext.put("memberPageRaffleId",apiResult.memberPage.get("activeId"))
        testContext.put("integralCenterRaffleId",apiResult.integralCenterPage.get("activeId"))
        testContext.put("integralPageRaffleId",apiResult.integralPage.get("activeId"))
        print(apiResult.integralCenterPage.get("activeId"))
        return this
    }
}
