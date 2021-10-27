package com.meiji.biz.request.http.OMS.account

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class FundFlowRecordExport extends OMSPost {
    {
        super.api = "/api/supplier/finance/fundFlowRecordExport"
        super.params =  [ "condition","order","page","rows","sort"]

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
        super.baseAssert(testContext)
        return this
    }

}
