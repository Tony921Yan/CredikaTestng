package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class QueryBrandsByPage extends MeijiRequest{
    {
        super.api = "/platform/brandMgr/queryBrandsByPage"
        super.params = ["condition","order","page","rows","sort"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
