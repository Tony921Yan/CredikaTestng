package com.meiji.biz.request.http.mall.coupon

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetActiveCoupon extends MallPost{
    {
        super.api = "coupon/getActiveCoupon"
       super.params = ["activeId"]
    }

    GetActiveCoupon invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetActiveCoupon preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetActiveCoupon baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        //super.baseAssert(testContext)
        return this
    }


}
