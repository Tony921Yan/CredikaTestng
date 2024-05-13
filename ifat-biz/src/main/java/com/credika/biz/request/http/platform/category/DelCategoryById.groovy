package com.credika.biz.request.http.platform.category


import com.miyuan.ifat.support.test.TestContext

class DelCategoryById extends com.credika.biz.request.http.platform.PlatformPost{
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
