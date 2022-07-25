package com.meiji.biz.request.http.mall.coupon

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class ReceiveActiveCoupon extends MallPost{
    {
        super.api = "coupon/receiveActiveCoupon"
       super.params = ["activeId","couponId"]
    }

    ReceiveActiveCoupon invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ReceiveActiveCoupon preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ReceiveActiveCoupon baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 0
        //super.baseAssert(testContext)
        return this
    }


}
