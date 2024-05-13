package com.credika.biz.request.http.platform.grantCouponActive


import com.miyuan.ifat.support.test.TestContext

class PublishActive extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="grantCouponActive/publishActive"
        super.params = ["id"]
    }

    PublishActive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PublishActive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PublishActive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}