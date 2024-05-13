package com.credika.biz.request.http.mall.newVip

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetGoodsInCoupon extends MallPost{
    {
        super.api = "newVip/getGoodsInCoupon"
       super.params = ["page","rows" ]
    }

    GetGoodsInCoupon invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGoodsInCoupon preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGoodsInCoupon baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
