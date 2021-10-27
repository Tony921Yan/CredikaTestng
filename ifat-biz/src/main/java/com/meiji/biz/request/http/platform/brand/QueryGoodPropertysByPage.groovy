package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class QueryGoodPropertysByPage extends PlatformPost{
    {
        super.api = "AttrManagement/queryGoodPropertys"
        super.params = ["page","rows","condition"]
    }

    QueryGoodPropertysByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    QueryGoodPropertysByPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}
