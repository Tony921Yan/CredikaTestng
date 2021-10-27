package com.meiji.biz.request.http.OMS.account

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class Withdraw extends OMSPost {
    {
        super.api = "/api/supplier/finance/withdraw"
        super.params =  [ "amount","remark","supplierId"]

    }

    Withdraw invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Withdraw preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Withdraw baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
