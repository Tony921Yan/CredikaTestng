package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateBrand extends PlatformPost{
    {
        super.api = "/platform/brandMgr/updateBrand"
        super.params = ["createBy","gmtCreate","gmtModified","icon","id","name","remark","sort","updateBy"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
