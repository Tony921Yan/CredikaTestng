package com.meiji.biz.request.http.platform.category

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService

class GetCategory extends PlatformPost{
    {
        super.api = "CategoryManagement/queryTree"
        super.params = []
    }

    GetCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    GetCategory dataAssert(TestContext testContext){
        List mysqlData = MysqlService.getCategory(testContext.get("type"),testContext.get("name"))
        List apiData = testContext.getResponse().data
        assert mysqlData.size()==apiData.size()
        return this
    }
}
