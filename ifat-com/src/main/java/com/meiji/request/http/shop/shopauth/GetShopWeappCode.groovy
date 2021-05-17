package com.meiji.request.http.shop.shopauth

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiGet

class GetShopWeappCode extends MeijiGet {
    {
        super.api = "/shop/getShopWeappCode?shopId=10006&scene=shopId:10006"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}
