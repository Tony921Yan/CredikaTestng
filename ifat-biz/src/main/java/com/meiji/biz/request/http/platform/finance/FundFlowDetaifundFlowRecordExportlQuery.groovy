package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class FundFlowDetaifundFlowRecordExportlQuery extends PlatformPost{
    {
        super.api="OrderFlow/fundFlowDetaifundFlowRecordExportlQuery"
        super.params = ["condition"]
    }

    FundFlowDetaifundFlowRecordExportlQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FundFlowDetaifundFlowRecordExportlQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FundFlowDetaifundFlowRecordExportlQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
