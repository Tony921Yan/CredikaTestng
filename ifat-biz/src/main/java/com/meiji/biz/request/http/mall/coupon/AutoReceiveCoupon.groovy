package com.meiji.biz.request.http.mall.coupon

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class AutoReceiveCoupon extends MallPost{
    {
        super.api = "coupon/autoReceiveCoupon"
       super.params = ["source"]
    }

    AutoReceiveCoupon invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AutoReceiveCoupon preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AutoReceiveCoupon baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
