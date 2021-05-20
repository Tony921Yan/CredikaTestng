package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CreateGoodPropertyGroup extends PlatformPost{
    {
        super.api = "/platform/goodPropGroupMgr/createGoodPropertyGroup"
        super.params = ["categoryId","code","createBy","gmtCreate","id","list","name","remark"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
