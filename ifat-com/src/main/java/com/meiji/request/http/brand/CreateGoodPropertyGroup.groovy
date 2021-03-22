package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class CreateGoodPropertyGroup extends MeijiRequest{
    {
        super.api = "/platform/goodPropGroupMgr/createGoodPropertyGroup"
        super.params = ["categoryId","code","createBy","gmtCreate","id","list","name","remark"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
