package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ShopManage extends PlatformPost {
    {
        super.api = "ShopManage/findShopPage"
        super.params =  [ "page","rows"]
    }

    ShopManage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShopManage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShopManage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    ShopManage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}
