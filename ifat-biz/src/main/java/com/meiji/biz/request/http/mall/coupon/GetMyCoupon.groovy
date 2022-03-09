package com.meiji.biz.request.http.mall.coupon

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetMyCoupon extends MallPost{
    {
        super.api = "coupon/getMyCoupon"
       super.params = ["page","rows","status"]
    }

    GetMyCoupon invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetMyCoupon preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetMyCoupon baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
