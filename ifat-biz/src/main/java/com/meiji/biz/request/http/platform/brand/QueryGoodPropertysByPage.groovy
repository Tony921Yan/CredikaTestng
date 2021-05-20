package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class QueryGoodPropertysByPage extends PlatformPost{
    {
        super.api = "/platform/goodPropertyMgr/queryGoodPropertysByPage"
        super.params = ["order","page","rows","condition","sort"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
