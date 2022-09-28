package com.meiji.biz.request.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetOngoingRaffles extends PlatformPost{
    {
        super.api = "ActiveMainManage/getOngoingRaffles"
        super.params = []
    }

    GetOngoingRaffles invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOngoingRaffles baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
