package com.meiji.biz.request.http.platform.category

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService

class GetCategoryByName extends PlatformPost{
    {
        super.api = "/platform/categoryMgr/getCategoryByName"
        super.params = ["name","type"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    PlatformPost dataAssert(TestContext testContext){
        List mysqlData = MysqlService.getCategory(testContext.get("type"),testContext.get("name"))
        List apiData = testContext.getResponse().data
        assert mysqlData.size()==apiData.size()
    }
}
