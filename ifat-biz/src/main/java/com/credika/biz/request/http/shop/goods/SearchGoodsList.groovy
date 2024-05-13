package com.credika.biz.request.http.shop.goods

import com.credika.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class SearchGoodsList extends ShopPost {
    {
        super.api = "goods/searchGoodsList"
        super.params =  [ "shopId","brandId","categoryIdList","comprehensiveSort","page","priceSort","publishTimeSort",
                          "rows","salesSort","searchText"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ShopPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShopPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShopPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    ShopPost specialAssert(TestContext testContext){
    }
}
