package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UpdateBrand extends MeijiRequest{
    {
        super.api = "/platform/brandMgr/updateBrand"
        super.params = ["createBy","gmtCreate","gmtModified","icon","id","name","remark","sort","updateBy"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
