package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext

class GetConfigByModule extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "SystemConfigMgr/getConfigByModule"
        super.params =  ["modules"]
    }

    GetConfigByModule invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetConfigByModule preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetConfigByModule baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
