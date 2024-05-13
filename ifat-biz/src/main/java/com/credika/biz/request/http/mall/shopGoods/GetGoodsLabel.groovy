package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetGoodsLabel extends MallPost {
    {
        super.api = "shopGoods/getGoodsLabel"
        super.params =  ["spuIds"]
    }

    GetGoodsLabel invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGoodsLabel preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGoodsLabel baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
