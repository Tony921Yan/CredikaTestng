package com.credika.biz.request.http.platform.category


import com.miyuan.ifat.support.test.TestContext

class GetCategory extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "CategoryManagement/queryTree"
        super.params = []
    }

    GetCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}
