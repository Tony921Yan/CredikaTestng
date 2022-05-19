package com.meiji.biz.request.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SaveSourceRaffle extends PlatformPost{
    {
        super.api = "ActiveMainManage/saveSourceRaffle"
       super.params = ["paymentPageRaffleId","separatePageRaffleId"]
    }

    SaveSourceRaffle invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SaveSourceRaffle baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    SaveSourceRaffle afterInvoke(TestContext testContext){
        System.out.println(testContext.getRequest().id)
//        testContext.put("id",testContext.getRequest().id)
    }
}
