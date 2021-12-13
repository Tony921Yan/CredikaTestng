package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SearchRankGoodsList extends MallPost {
    {
        super.api = "shopGoods/searchRankGoodsList"
        super.params =  ["rankCategoryId","shopId"]
    }

    SearchRankGoodsList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchRankGoodsList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchRankGoodsList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
