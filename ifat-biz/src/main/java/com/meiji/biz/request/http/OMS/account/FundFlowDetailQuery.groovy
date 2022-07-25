package com.meiji.biz.request.http.OMS.account

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class FundFlowDetailQuery extends OMSPost {
    {
        super.api = "OrderFlow/fundFlowDetailQuery"
        super.params =  [ "supplierId","tradeOrderNo"]

    }

    FundFlowDetailQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FundFlowDetailQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FundFlowDetailQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
