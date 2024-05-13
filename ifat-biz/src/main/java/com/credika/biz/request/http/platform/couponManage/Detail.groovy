package com.credika.biz.request.http.platform.couponManage


import com.miyuan.ifat.support.test.TestContext

class Detail extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "CouponManage/detail"
        super.params = ["id"]
    }

    Detail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Detail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Detail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
