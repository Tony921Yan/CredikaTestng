package com.meiji.biz.request.http.platform.suppiler
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddAdministrator extends PlatformPost{
    {
        super.api="SupplierManage/addAdministrator"
        super.params = ["supplierId",
                        "supplierCode",
                        "contactType",
                        "contactName",
                        "mobilePhone",
                        "contactIdCardNumber",
                        "contactEmail"]
    }

    AddAdministrator invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddAdministrator preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddAdministrator baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
