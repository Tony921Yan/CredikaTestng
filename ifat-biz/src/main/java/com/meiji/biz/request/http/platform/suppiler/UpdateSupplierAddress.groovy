package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateSupplierAddress extends PlatformPost{
    {
        super.api="/platform/supplierMgr/updateSupplierAddress"
        super.params = ["id","isDefault","contactsAddress","contactsAddressDetail","contactsName","contactsPhone","createBy","supplierCode",
        "supplierId","updateBy"]
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
