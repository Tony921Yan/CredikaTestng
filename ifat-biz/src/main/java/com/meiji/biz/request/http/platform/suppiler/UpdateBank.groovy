package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateBank extends PlatformPost{
    {
        super.api="SupplierManage/updateBank"
        super.params = ["supplierId","accountBank","contactNumber","accountNumber",
        "contactAddress","accountType","bankAddressCode","bankName"]
    }

    UpdateBank invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateBank preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateBank baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
