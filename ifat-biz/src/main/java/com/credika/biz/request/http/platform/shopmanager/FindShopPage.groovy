package com.credika.biz.request.http.platform.shopmanager


import com.miyuan.ifat.support.test.TestContext

class FindShopPage extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ShopManage/findShopPage"
        super.params =  [ "auditState","createTimeEnd","createTimeStart","page","rows","shopCode","shopName","shopType"]
    }

    FindShopPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindShopPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
