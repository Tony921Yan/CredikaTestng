package com.credika.biz.request.http.mall.coupon

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class ReceiveCoupon extends MallPost{
    {
        super.api = "coupon/receiveCoupon"
       super.params = ["activeId"]
    }

    ReceiveCoupon invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ReceiveCoupon preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ReceiveCoupon baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
