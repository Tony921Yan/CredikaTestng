package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class AddPlatformIntegral extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/IntegralList/addPlatformIntegral"
        super.params = ["integral"]
    }

    AddPlatformIntegral invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddPlatformIntegral preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddPlatformIntegral baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}