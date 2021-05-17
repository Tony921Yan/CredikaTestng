package com.meiji.biz.request.http.brand

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

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
