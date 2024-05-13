package com.credika.biz.request.http.platform.systemConfigMgr


import com.miyuan.ifat.support.test.TestContext

class UpdateSearchKeyNew extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/SystemConfigMgr/updateSearchKeyNew"
        super.params =  [ "searchKeys"]
    }

    UpdateSearchKeyNew invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    UpdateSearchKeyNew preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    UpdateSearchKeyNew baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
