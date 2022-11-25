package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SearchGoodsListWithCategory extends MallPost {
    {
        super.api = "shopGoods/searchGoodsListWithCategory"
        super.params =  ["page","rows","shopId","categoryIdList","comprehensiveSort","priceSort","publishTimeSort","salesSort","searchText"]
    }

    SearchGoodsListWithCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchGoodsListWithCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchGoodsListWithCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
