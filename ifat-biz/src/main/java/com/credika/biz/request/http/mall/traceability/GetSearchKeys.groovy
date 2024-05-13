package com.credika.biz.request.http.mall.traceability

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetSearchKeys extends MallPost{
    {
        super.api = "traceability/getSearchKeys"
       super.params = []
    }

    GetSearchKeys invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSearchKeys preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSearchKeys baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
