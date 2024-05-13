package com.credika.biz.request.http.mall.coupon

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetMyCouponCount extends MallPost{
    {
        super.api = "coupon/getMyCouponCount"
       super.params = []
    }

    GetMyCouponCount invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetMyCouponCount preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetMyCouponCount baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
