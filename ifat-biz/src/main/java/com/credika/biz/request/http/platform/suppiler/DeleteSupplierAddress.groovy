package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class DeleteSupplierAddress extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/SupplierManage/deleteSupplierAddress"
        super.params = ["supplierAddressId"]
    }

    DeleteSupplierAddress invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    DeleteSupplierAddress preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeleteSupplierAddress baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
