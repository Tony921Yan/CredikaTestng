package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateShopInfo extends PlatformPost {
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
