package com.credika.biz.request.http.OMS.account

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class FundFlowPageQuery extends OMSPost {
    {
        super.api = "OrderFlow/fundFlowPageQuery"
        super.params =  [ "condition","order","page","rows","sort"]

    }

    FundFlowPageQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FundFlowPageQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FundFlowPageQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
