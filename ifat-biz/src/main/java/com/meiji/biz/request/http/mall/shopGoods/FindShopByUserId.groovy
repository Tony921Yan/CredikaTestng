package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindShopByUserId extends MallPost {
    {
        super.api = "shopGoods/findShopByUserId"
        super.params =  []
    }

    FindShopByUserId invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopByUserId preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindShopByUserId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
