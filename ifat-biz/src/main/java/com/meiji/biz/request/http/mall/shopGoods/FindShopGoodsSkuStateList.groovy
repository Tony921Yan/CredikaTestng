package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindShopGoodsSkuStateList extends MallPost {
    {
        super.api = "shopGoods/findShopGoodsStateList"
        super.params =  ["shopId","skuIdList"]
    }

    FindShopGoodsSkuStateList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopGoodsSkuStateList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindShopGoodsSkuStateList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
