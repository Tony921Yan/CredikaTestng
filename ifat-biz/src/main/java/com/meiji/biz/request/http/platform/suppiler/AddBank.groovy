package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddBank extends PlatformPost{
    {
        super.api="/platform/supplierMgr/addBank"
        super.params = ["supplierId","supplierCode","bankAccountType","accountBank","accountName","bankAddressCode",
        "bankBranchId","bankName","accountNumber","createBy","updateBy","gmtCreate","gmtModified"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
