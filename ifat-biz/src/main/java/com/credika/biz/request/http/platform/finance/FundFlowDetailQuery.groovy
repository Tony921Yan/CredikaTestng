package com.credika.biz.request.http.platform.finance


import com.miyuan.ifat.support.test.TestContext

class FundFlowDetailQuery extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="OrderFlow/fundFlowDetailQuery"
        super.params = ["orderCode"]
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
