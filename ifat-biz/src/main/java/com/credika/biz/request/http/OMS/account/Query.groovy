package com.credika.biz.request.http.OMS.account

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class Query extends OMSPost {
    {
        super.api = "/api/supplier/finance/query"
        super.params =  [ "bank","keyword","limit","page"]

    }

    Query invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Query preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Query baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
