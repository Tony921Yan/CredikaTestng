package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class SaveSourceRaffle extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "ActiveMainManage/saveSourceRaffle"
       super.params = ["separatePageRaffleId","paymentPageRaffleId","memberPageRaffleId","integralCenterRaffleId","integralPageRaffleId"]
    }

    SaveSourceRaffle invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SaveSourceRaffle preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SaveSourceRaffle baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
