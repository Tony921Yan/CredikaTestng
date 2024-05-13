package com.credika.biz.request.http.platform.category


import com.miyuan.ifat.support.test.TestContext

class AddCategory extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "CategoryManagement/addCategory"
        super.params = ["createBy","icon","name","parentId","parentName","sort","status","type"]
    }

    AddCategory invoke(TestContext testContext) {
        com.credika.biz.service.MysqlService.deleteCategory(testContext.get("name"))
        super.invoke(testContext)
        return this
    }

    AddCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    AddCategory dataAssert(TestContext testContext){
        List mysqlData = com.credika.biz.service.MysqlService.addCategory(testContext.get("type"),testContext.get("sort"))
        List apiData = testContext.getRequest().toString()
        System.out.println("apidate: " + apiData)
        assert mysqlData.size() == apiData.size()
        return this
    }

}
