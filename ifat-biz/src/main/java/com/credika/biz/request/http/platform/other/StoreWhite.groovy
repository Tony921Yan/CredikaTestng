package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext

class StoreWhite extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "StoreWhite/findShopPage"
        super.params =  [ "page","rows","shopName","shopCode","searchTestShop"]
    }

    StoreWhite invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    StoreWhite preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    StoreWhite baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    StoreWhite specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 0
        return this
    }
}
