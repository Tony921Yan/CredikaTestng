package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindShopGoodsList extends MallPost {
    {
        super.api = "/shopGoods/searchGoodsList"
        super.params =  ["page","rows","shopId","categoryIdList","keyword","state"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindShopGoodsList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopGoodsList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindShopGoodsList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindShopGoodsList specialAssert(TestContext testContext){
        return this
    }
}
