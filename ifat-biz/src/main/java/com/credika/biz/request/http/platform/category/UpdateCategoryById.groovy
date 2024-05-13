package com.credika.biz.request.http.platform.category


import com.miyuan.ifat.support.test.TestContext

class UpdateCategoryById extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "CategoryManagement/updateCategoryById"
        super.params = ["list"]
    }

    UpdateCategoryById invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateCategoryById preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateCategoryById baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
