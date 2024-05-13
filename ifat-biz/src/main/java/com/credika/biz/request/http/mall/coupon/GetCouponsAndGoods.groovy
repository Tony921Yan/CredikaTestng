package com.credika.biz.request.http.mall.coupon

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetCouponsAndGoods extends MallPost{
    {
        super.api = "coupon/getCouponsAndGoods"
       super.params = ["userId"]
    }

    GetCouponsAndGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCouponsAndGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetCouponsAndGoods baseAssert(TestContext testContext){
        // assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
