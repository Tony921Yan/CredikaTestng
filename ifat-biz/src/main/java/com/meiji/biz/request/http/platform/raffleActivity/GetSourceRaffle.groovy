package com.meiji.biz.request.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

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
}
