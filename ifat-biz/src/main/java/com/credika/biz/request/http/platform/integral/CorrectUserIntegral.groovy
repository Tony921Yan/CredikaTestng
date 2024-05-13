package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class CorrectUserIntegral extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/IntegralList/correctUserIntegral"
        super.params = ["integral","remark","type","userId"]
    }

    CorrectUserIntegral invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CorrectUserIntegral preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CorrectUserIntegral baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}