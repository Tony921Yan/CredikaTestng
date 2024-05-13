package com.credika.biz.request.http.platform.grantCouponActive


import com.miyuan.ifat.support.test.TestContext

class AddActive extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="grantCouponActive/addActive"
        super.params = ["name","type","introduce","expiryStart","expiryEnd","couponIntegralRuleList"]
    }

    AddActive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddActive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddActive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}