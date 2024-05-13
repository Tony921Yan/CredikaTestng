package com.credika.biz.request.http.platform.category


import com.miyuan.ifat.support.test.TestContext

/*美粉圈分类*/
class QueryTree extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "CategoryManagement/queryTree"
        super.params = []
    }

    QueryTree invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    QueryTree preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    QueryTree baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
