package com.credika.biz.request.http.mall.gift

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class TryAcquireGift extends MallPost {
    {
        super.api = "gift/tryAcquireGift"
        super.params =  ["addressId","giftId","nickname","avatar"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    TryAcquireGift invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    TryAcquireGift baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
