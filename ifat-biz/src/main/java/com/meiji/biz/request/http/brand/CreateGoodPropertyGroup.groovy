package com.meiji.biz.request.http.brand

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

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