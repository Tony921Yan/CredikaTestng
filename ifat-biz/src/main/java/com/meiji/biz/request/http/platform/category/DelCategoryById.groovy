package com.meiji.biz.request.http.platform.category

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService

class DelCategoryById extends PlatformPost{
    {
        super.api = "CategoryManagement/delCategoryById"
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

}
