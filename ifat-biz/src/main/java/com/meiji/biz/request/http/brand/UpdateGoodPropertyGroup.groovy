package com.meiji.biz.request.http.brand

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class UpdateGoodPropertyGroup extends MeijiRequest{
    {
        super.api = "/platform/goodPropGroupMgr/updateGoodPropertyGroup"
        super.params = ["categoryId","code","createBy","gmtModified","id","name","remark","updateBy","list"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
