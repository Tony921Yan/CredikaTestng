package com.meiji.biz.request.http.brand

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

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
