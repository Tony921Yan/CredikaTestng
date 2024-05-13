package com.credika.biz.request.http.platform.grantCouponActive


import com.miyuan.ifat.support.test.TestContext

class UpdateActive extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="grantCouponActive/updateActive"
        super.params = ["name","type","introduce","expiryStart","expiryEnd","couponIntegralRuleList","id"]
    }

    UpdateActive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateActive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateActive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}