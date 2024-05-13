package com.credika.biz.request.http.platform.grantCouponActive


import com.miyuan.ifat.support.test.TestContext

class GetActiveByPage extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="grantCouponActive/getActiveByPage"
        super.params = ["condition","page","rows"]
    }

    GetActiveByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetActiveByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetActiveByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}