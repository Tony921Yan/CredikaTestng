package com.meiji.request.http.category

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest
import com.meiji.service.MysqlService

class GetCategoryByName extends MeijiRequest{
    {
        super.api = "/platform/categoryMgr/getCategoryByName"
        super.params = ["name","type"]
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
    }

    MeijiRequest dataAssert(TestContext testContext){
        List mysqlData = MysqlService.getCategory(testContext.get("type"),testContext.get("name"))
        List apiData = testContext.getResponse().data
        assert mysqlData.size()==apiData.size()
    }
}
