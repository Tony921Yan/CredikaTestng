package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class FundFlowPageQuery extends PlatformPost{
    {
        super.api="OrderFlow/fundFlowPageQuery"
        super.params = ["condition","order","page","rows","sort"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
