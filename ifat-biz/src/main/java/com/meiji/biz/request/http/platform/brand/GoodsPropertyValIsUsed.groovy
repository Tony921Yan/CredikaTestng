package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GoodsPropertyValIsUsed extends PlatformPost{
    {
        super.api = "/platform/goodPropertyMgr/goodsPropertyValIsUsed"
        super.params = ["id"]
    }

    GoodsPropertyValIsUsed invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
