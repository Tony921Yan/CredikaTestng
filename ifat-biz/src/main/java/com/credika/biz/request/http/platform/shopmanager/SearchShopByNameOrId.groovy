package com.credika.biz.request.http.platform.shopmanager


import com.miyuan.ifat.support.test.TestContext

class SearchShopByNameOrId extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "ShopManage/searchShopByNameOrId"    //接口地址
        super.params = ["keyword"]                       //接口参数
    }

    SearchShopByNameOrId invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchShopByNameOrId preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchShopByNameOrId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
