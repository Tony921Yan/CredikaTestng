package com.meiji.request.http.category

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest
import com.meiji.service.MysqlService

class AddCategory extends MeijiRequest{
    {
        super.api = "/platform/categoryMgr/addCategory"
        super.params = ["createBy","icon","name","parentId","parentName","sort","status","type"]
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
        List mysqlData = MysqlService.addCategory(testContext.get("type"),testContext.get("sort"))
        List apiData = testContext.getRequest().toString()
        System.out.println("apidate: " + apiData)
        assert mysqlData.size() == apiData.size()
    }

}
