package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class QueryBrandsByPage extends PlatformPost{
    {
        super.api = "/platform/brandMgr/queryBrandsByPage"
        super.params = ["condition","order","page","rows","sort"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
