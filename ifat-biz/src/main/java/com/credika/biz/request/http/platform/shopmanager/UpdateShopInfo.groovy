package com.credika.biz.request.http.platform.shopmanager


import com.miyuan.ifat.support.test.TestContext

class UpdateShopInfo extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ShopManage/updateShopInfo"
        super.params =  ["id","shopName","brief","shopIcon"]
    }

    UpdateShopInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateShopInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateShopInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
