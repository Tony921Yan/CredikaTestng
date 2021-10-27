package com.meiji.biz.request.http.OMS.account

import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class Account extends OMSGet {
    {
        super.api = "/api/supplier/finance/account"
        super.params =  [ "supplierId"]

    }

    Account invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Account preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Account baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
