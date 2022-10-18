package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Result

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
        Result result = testContext.getResult() as Result
        assert result.getHttpStatusCode() == 200
        return this
    }

}
