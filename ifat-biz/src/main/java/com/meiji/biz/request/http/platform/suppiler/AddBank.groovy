package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddBank extends PlatformPost{
    {
        super.api="SupplierManage/addBank"
        super.params = ["supplierId","supplierCode","bankAccountType","accountBank","accountName","bankAddressCode",
        "bankBranchId","bankName","accountNumber","createBy","updateBy","gmtCreate","gmtModified"]
    }

    AddBank invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddBank preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddBank baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
