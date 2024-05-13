package com.credika.biz.request.http.platform.category


import com.miyuan.ifat.support.test.TestContext

/*美粉圈二级分类*/

class QuerySecondLevelCategory extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "MaterialCategoryManagement/querySecondLevelCategory"
        super.params = []
    }

    QuerySecondLevelCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    QuerySecondLevelCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    QuerySecondLevelCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
