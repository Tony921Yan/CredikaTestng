package com.credika.biz.request.http.platform.grantCouponActive


import com.miyuan.ifat.support.test.TestContext

class CncelActive extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="grantCouponActive/cancelActive"
        super.params = ["id"]
    }

    CncelActive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CncelActive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CncelActive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}