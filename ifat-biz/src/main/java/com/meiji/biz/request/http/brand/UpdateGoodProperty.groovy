package com.meiji.biz.request.http.brand

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

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
