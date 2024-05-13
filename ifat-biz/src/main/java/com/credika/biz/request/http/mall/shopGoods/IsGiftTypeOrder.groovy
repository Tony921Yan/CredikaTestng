package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class IsGiftTypeOrder extends MallPost {
    {
        super.api = "shopGoods/isGiftTypeOrder"
        super.params =  [ ]
    }

    IsGiftTypeOrder invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    IsGiftTypeOrder preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    IsGiftTypeOrder baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
