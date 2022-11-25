package com.meiji.biz.request.http.mall.traceability

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetCategoryList extends MallPost{
    {
        super.api = "traceability/getCategoryList"
       super.params = []
    }

    GetCategoryList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCategoryList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetCategoryList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
