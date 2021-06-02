package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class DeleteSupplierAddress extends PlatformGet{
    {
        super.api="/platform/supplierMgr/deleteSupplierAddress"
        super.params = ["supplierAddressId"]
    }

    PlatformGet invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    PlatformGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
