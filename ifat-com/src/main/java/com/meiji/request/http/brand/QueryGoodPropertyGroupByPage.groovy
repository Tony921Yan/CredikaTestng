package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class QueryGoodPropertyGroupByPage extends MeijiRequest{
    {
        super.api = "/platform/GoodPropGroupMgr/queryGoodPropertyGroupByPage"
        super.params = ["queryCondition","pageIndex","pageSize","order","sort"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
