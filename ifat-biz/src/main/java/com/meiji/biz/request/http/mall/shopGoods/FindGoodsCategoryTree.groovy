package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindGoodsCategoryTree extends MallPost {
    {
        super.api = "/shopGoods/findGoodsCategoryTree"
        super.params =  ["id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindGoodsCategoryTree invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindGoodsCategoryTree preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindGoodsCategoryTree baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindGoodsCategoryTree specialAssert(TestContext testContext){
        return this
    }
}
