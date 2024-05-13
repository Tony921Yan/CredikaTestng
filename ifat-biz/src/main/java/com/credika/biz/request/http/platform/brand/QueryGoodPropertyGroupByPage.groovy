package com.credika.biz.request.http.platform.brand

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class QueryGoodPropertyGroupByPage extends PlatformPost{
    {
        super.api = "/platform/GoodPropGroupMgr/queryGoodPropertyGroupByPage"
        super.params = ["queryCondition","pageIndex","pageSize","order","sort"]
    }

    QueryGoodPropertyGroupByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
