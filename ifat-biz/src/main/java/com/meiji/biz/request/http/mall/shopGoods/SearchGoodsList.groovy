package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SearchGoodsList extends MallPost {
    {
        super.api = "/shopGoods/searchGoodsList"
        super.params =  ["shopId","brandId","categoryIdList","comprehensiveSort","page","priceSort","publishTimeSort",
                         "rows","salesSort","searchText"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    SearchGoodsList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchGoodsList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchGoodsList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    MallPost specialAssert(TestContext testContext){
        return this
    }
}
