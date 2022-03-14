package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GoodPropertyDetail extends PlatformPost{
    {
        super.api = "AttrManagement/goodPropertyDetail"
        super.params = ["id"]
    }

    GoodPropertyDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
