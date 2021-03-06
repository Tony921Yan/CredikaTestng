package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UpdateGoodProperty extends MeijiRequest{
    {
        super.api = "/platform/goodPropertyMgr/updateGoodProperty"
        super.params = ["gmtModified","id","isMust","isSearch","name","remark","status","type","updateBy","goodPropertyValues"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
