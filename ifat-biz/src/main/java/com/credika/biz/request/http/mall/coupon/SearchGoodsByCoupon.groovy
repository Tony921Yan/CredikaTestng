package com.credika.biz.request.http.mall.coupon

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SearchGoodsByCoupon extends MallPost{
    {
        super.api = "coupon/searchGoodsByCoupon"
       super.params = ["comprehensiveSort","couponId","page","rows","shopId","priceSort","publishTimeSort","salesSort"]
    }

    SearchGoodsByCoupon invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchGoodsByCoupon preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchGoodsByCoupon baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
