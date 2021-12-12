package com.meiji.biz.request.http.platform.category

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/*美粉圈二级分类*/

class QuerySecondLevelCategory extends PlatformPost{
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
