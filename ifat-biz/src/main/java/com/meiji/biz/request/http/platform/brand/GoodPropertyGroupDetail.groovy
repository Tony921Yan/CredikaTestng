package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GoodPropertyGroupDetail extends PlatformPost{
    {
        super.api = "/platform/goodPropGroupMgr/goodPropertyGroupDetail"
        super.params = ["id"]
    }

    GoodPropertyGroupDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
