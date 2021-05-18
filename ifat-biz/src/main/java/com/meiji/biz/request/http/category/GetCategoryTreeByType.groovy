package com.meiji.biz.request.http.category

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest
import com.meiji.biz.service.MysqlService

class GetCategoryTreeByType extends MeijiRequest{
    {
        super.api = "/platform/categoryMgr/getCategoryTreeByType"
        super.params = ["type"]
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
        List mysqlData = MysqlService.getCategoryByType(testContext.get("type"))
        List apiData = testContext.getResponse().data
        System.out.println("apiData:" + apiData)
        assert mysqlData.size() == apiData.size()
    }

}