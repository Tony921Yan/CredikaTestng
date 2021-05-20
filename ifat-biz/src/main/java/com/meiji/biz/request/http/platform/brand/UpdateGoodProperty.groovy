package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateGoodProperty extends PlatformPost{
    {
        super.api = "/platform/goodPropertyMgr/updateGoodProperty"
        super.params = ["gmtModified","id","isMust","isSearch","name","remark","status","type","updateBy","goodPropertyValues"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
