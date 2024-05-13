package com.credika.biz.request.http.shop.shopauth

import com.credika.biz.request.http.shop.ShopGet
import com.miyuan.ifat.support.test.TestContext

class GetShopWeappCode extends ShopGet {
    {
        super.api = "getShopWeappCode?shopId=10006&scene=shopId:10006"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ShopGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShopGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShopGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}
