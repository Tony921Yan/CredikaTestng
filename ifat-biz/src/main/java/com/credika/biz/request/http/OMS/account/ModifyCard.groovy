package com.credika.biz.request.http.OMS.account

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class ModifyCard extends OMSPost {
    {
        super.api = "AccountAssets/modifyCard"
        super.params =  [ "accountBank","accountNumber","accountType","bankAddressCode","bankBranchId","bankName","supplierId"]

    }

    ModifyCard invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ModifyCard preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ModifyCard baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
