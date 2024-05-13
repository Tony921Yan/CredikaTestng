package com.credika.biz.request.http.platform.raffleActivity


import com.miyuan.ifat.support.test.TestContext

class GetOngoingRaffles extends com.credika.biz.request.http.platform.PlatformPost{
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
