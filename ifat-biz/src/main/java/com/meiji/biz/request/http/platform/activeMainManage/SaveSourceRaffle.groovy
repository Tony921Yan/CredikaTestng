package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SaveSourceRaffle extends PlatformPost{
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
