package com.credika.biz.request.http.platform.grantCouponActive


import com.miyuan.ifat.support.test.TestContext

class GetActiveDetailById extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="grantCouponActive/getActiveDetailById"
        super.params = ["id"]
    }

    GetActiveDetailById invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetActiveDetailById preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetActiveDetailById baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}