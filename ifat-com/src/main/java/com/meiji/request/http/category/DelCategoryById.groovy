package com.meiji.request.http.category

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest
import com.meiji.service.MysqlService

class DelCategoryById extends MeijiRequest{
    {
        super.api = "/platform/categoryMgr/delCategoryById"
        super.params = ["id"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    MeijiRequest dataAssert(TestContext testContext) {
        List mysqlData = MysqlService.getCategoryById(testContext.get("id"))
        assert mysqlData.size() == 0
        return this
    }


}
