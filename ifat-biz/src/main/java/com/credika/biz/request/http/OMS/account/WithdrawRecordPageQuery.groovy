package com.credika.biz.request.http.OMS.account

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class WithdrawRecordPageQuery extends OMSPost {
    {
        super.api = "Withdraw/withdrawRecordPageQuery"
        super.params =  [ "condition","order","page","rows","sort"]

    }

    WithdrawRecordPageQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    WithdrawRecordPageQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    WithdrawRecordPageQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
