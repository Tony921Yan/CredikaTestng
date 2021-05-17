package com.meiji.request.http.mall

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class FindRecommendGoods extends MeijiRequest {
    {
        super.api = "/mall/shop/goods/findRecommendGoods"
        super.params =  ["shopId","spuId","size","sort","sortType"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
