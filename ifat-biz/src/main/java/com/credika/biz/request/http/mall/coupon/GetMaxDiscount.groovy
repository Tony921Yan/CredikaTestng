package com.credika.biz.request.http.mall.coupon

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetMaxDiscount extends MallPost{
    {
        super.api = "coupon/getMaxDiscount"
       super.params = ["couponActId","spuId","coupons","skuId"]
    }

    GetMaxDiscount invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetMaxDiscount preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetMaxDiscount baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
