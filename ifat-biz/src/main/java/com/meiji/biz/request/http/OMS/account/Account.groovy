package com.meiji.biz.request.http.OMS.account

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class Account extends OMSPost {
    {
        super.api = "AccountAssets/getAccount"
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
