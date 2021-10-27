package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddSupplierAddress extends PlatformPost{
    {
        super.api="/platform/supplierMgr/addSupplierAddress"
        super.params = ["contactsAddress","contactsAddressDetail","contactsName","contactsPhone","createBy","supplierCode",
        "supplierId","updateBy"]
    }

    AddSupplierAddress invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddSupplierAddress preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddSupplierAddress baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
