package com.credika.biz.request.http.platform.brand

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateGoodProperty extends PlatformPost{
    {
        super.api = "AttrManagement/updateGoodProperty"
        super.params = ["gmtModified","id","isMust","isSearch","name","remark","status","type","updateBy","goodPropertyValues"]
    }

    UpdateGoodProperty invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
