package com.meiji.biz.request.http.suppiler

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class AddBank extends MeijiRequest{
    {
        super.api="/platform/supplierMgr/addBank"
        super.params = ["supplierId","supplierCode","bankAccountType","accountBank","accountName","bankAddressCode",
        "bankBranchId","bankName","accountNumber","createBy","updateBy","gmtCreate","gmtModified"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
