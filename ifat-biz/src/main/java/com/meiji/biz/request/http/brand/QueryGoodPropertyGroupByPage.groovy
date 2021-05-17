package com.meiji.biz.request.http.brand

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

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
