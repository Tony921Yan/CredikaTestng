package com.meiji.biz.request.http.platform.category

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService

class DelCategoryById extends PlatformPost{
    {
        super.api = "/platform/categoryMgr/delCategoryById"
        super.params = ["id"]
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
        return this
    }

    PlatformPost dataAssert(TestContext testContext) {
        List mysqlData = MysqlService.getCategoryById(testContext.get("id"))
        assert mysqlData.size() == 0
        return this
    }


}
