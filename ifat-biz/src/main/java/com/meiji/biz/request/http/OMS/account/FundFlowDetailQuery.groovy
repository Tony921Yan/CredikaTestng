package com.meiji.biz.request.http.OMS.account

import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class FundFlowDetailQuery extends OMSGet {
    {
        super.api = "/api/supplier/finance/fundFlowDetailQuery"
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
