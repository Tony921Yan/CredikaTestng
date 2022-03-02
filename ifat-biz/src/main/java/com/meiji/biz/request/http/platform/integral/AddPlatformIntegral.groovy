package com.meiji.biz.request.http.platform.integral
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddPlatformIntegral extends PlatformPost{
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