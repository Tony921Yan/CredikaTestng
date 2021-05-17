package com.meiji.biz.request.http.brand

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class QueryGoodPropertysByPage extends MeijiRequest{
    {
        super.api = "/platform/goodPropertyMgr/queryGoodPropertysByPage"
        super.params = ["order","page","rows","condition","sort"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
