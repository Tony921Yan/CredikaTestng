package com.credika.biz.request.http.mall.traceability

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetShowOrderList extends MallPost{
    {
        super.api = "traceability/getShowOrderList"
       super.params = [ "condition","order","page","rows","sort"]
    }

    GetShowOrderList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetShowOrderList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetShowOrderList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
