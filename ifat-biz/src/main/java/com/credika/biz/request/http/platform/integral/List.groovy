package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class List extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="CouponManage/list"
        super.params = ["page","rows","status","isExchangeFraction"]
    }

    List invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    List preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    List baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}