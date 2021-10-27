package com.meiji.biz.request.http.platform.category

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService

class DelCategoryById extends PlatformPost{
    {
        super.api = "/platform/categoryMgr/delCategoryById"
        super.params = ["id"]
    }

    DelCategoryById invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DelCategoryById preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DelCategoryById baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    DelCategoryById dataAssert(TestContext testContext) {
        List mysqlData = MysqlService.getCategoryById(testContext.get("id"))
        assert mysqlData.size() == 0
        return this
    }


}
