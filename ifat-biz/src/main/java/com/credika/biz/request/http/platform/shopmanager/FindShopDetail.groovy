package com.credika.biz.request.http.platform.shopmanager


import com.miyuan.ifat.support.test.TestContext

class FindShopDetail extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ShopManage/findShopDetail"
        super.params =  [ "id"]
    }

    FindShopDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindShopDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
