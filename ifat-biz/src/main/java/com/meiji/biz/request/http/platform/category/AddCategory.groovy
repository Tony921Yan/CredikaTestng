package com.meiji.biz.request.http.platform.category

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService

class AddCategory extends PlatformPost{
    {
        super.api = "/platform/categoryMgr/addCategory"
        super.params = ["createBy","icon","name","parentId","parentName","sort","status","type"]
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
        List mysqlData = MysqlService.addCategory(testContext.get("type"),testContext.get("sort"))
        List apiData = testContext.getRequest().toString()
        System.out.println("apidate: " + apiData)
        assert mysqlData.size() == apiData.size()
    }

}
