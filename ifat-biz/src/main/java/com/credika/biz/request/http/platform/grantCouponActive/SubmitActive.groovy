package com.credika.biz.request.http.platform.grantCouponActive


import com.miyuan.ifat.support.test.TestContext

class SubmitActive extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="grantCouponActive/submitActive"
        super.params = ["id"]
    }

    SubmitActive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SubmitActive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SubmitActive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}