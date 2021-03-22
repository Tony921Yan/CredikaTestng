package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

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
