package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateGoodPropertyGroup extends PlatformPost{
    {
        super.api = "AttrGroupManagement/updateGoodPropertyGroup"
        super.params = ["categoryId","code","createBy","gmtModified","id","name","remark","updateBy","list"]
    }

    UpdateGoodPropertyGroup invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
