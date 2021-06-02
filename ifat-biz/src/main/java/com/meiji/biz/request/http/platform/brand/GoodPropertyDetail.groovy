package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GoodPropertyDetail extends PlatformPost{
    {
        super.api = "/platform/goodPropertyMgr/goodPropertyDetail"
        super.params = ["id"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}