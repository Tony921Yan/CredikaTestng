package com.credika.biz.request.http.platform.couponManage


import com.miyuan.ifat.support.test.TestContext

class AddCouponNum extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "CouponManage/addCouponNum"
       super.params = ["id","num"]
    }

    AddCouponNum invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddCouponNum preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddCouponNum baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
