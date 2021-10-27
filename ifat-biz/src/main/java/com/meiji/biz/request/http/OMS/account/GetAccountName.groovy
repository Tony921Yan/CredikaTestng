package com.meiji.biz.request.http.OMS.account

import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class GetAccountName extends OMSGet {
    {
        super.api = "/api/supplier/finance/getAccountName"
        super.params =  [ "supplierId"]

    }

    GetAccountName invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetAccountName preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetAccountName baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
