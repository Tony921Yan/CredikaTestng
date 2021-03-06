package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UpdateGoodPropertyGroup extends MeijiRequest{
    {
        super.api = "/platform/GoodPropGroupMgr/updateGoodPropertyGroup"
        super.params = ["categoryId","code","createBy","gmtModified","id","name","remark","updateBy","list"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
