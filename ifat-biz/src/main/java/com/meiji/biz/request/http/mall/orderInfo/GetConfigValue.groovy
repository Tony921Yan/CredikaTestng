package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class GetConfigValue extends ShopPost {
    {
        super.api = "systemConfig/getConfigValue"
        super.params =  ["key"]
    }

    GetConfigValue invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetConfigValue preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetConfigValue baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
