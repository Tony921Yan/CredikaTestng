package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class GetSupplierDetail extends PlatformGet{
    {
        super.api="/platform/supplierMgr/getSupplierDetail"
        super.params = ["supplierId"]
    }

    GetSupplierDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSupplierDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSupplierDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
