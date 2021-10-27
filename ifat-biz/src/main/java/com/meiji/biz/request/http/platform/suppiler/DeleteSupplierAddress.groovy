package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class DeleteSupplierAddress extends PlatformGet{
    {
        super.api="/platform/supplierMgr/deleteSupplierAddress"
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
