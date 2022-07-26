package com.meiji.biz.request.http.OMS.account

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class WithdrawRecordExport extends OMSPost {
    {
        super.api = "withdraw/withdrawRecordExport"
        super.params =  [ "condition","order","page","rows","sort"]

    }

    WithdrawRecordExport invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    WithdrawRecordExport preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    WithdrawRecordExport baseAssert(TestContext testContext){
        assert testContext.get("result").getAt("httpStatusCode") ==200
        return this
    }

}
