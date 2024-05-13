package com.credika.biz.request.http.platform.couponManage


import com.miyuan.ifat.support.test.TestContext

class Del extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "CouponManage/del"
       super.params = ["id"]
    }

    Del invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Del preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Del baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
