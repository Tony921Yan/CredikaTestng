package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindRecommendGoods extends MallPost {
    {
        super.api = "/shopGoods/findRecommendGoods"
        super.params =  ["shopId","spuId","size","sort","sortType"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindRecommendGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindRecommendGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindRecommendGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
