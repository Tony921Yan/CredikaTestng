package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class GetSourceRaffle extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "ActiveMainManage/getSourceRaffle"
       super.params = []
    }

    GetSourceRaffle invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSourceRaffle preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSourceRaffle baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
