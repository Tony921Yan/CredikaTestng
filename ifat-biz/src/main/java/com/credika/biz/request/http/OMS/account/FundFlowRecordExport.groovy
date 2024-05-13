package com.credika.biz.request.http.OMS.account

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class FundFlowRecordExport extends OMSPost {
    {
        super.api = "OrderFlow/fundFlowDetaifundFlowRecordExportlQuery"
        super.params =  ["condition","order","page","rows","sort"]

    }

    FundFlowRecordExport invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FundFlowRecordExport preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    OMSPost baseAssert(TestContext testContext){
        assert  testContext.get("result").getAt("httpStatusCode") == 200
        return this
    }

}
