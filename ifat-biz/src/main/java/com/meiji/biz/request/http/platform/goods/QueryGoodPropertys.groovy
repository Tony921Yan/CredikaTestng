package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class QueryGoodPropertys extends PlatformPost{
    {
        super.api = "AttrManagement/queryGoodPropertys"
        super.params = ["condition","page","rows"]
    }

    QueryGoodPropertys invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    QueryGoodPropertys preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    QueryGoodPropertys baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
