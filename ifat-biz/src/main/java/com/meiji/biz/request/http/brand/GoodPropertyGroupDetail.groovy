package com.meiji.biz.request.http.brand

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class GoodPropertyGroupDetail extends MeijiRequest{
    {
        super.api = "/platform/goodPropGroupMgr/goodPropertyGroupDetail"
        super.params = ["id"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
