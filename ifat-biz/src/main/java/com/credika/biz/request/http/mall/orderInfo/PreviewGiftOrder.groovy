package com.credika.biz.request.http.mall.orderInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class PreviewGiftOrder extends MallPost {
    {
        super.api = "orderInfo/previewGiftOrder"
        super.params =  ["addressId","orderGoods","shopId","orderType"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    PreviewGiftOrder invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PreviewGiftOrder preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PreviewGiftOrder baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
