package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class FindShopDetail extends PlatformPost {
    {
        super.api = "/platform/shopMgr/findShopDetail"
        super.params =  [ "id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
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
