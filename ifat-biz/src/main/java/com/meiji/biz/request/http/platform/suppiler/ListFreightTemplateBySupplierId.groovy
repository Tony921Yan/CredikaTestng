package com.meiji.biz.request.http.platform.suppiler


import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ListFreightTemplateBySupplierId extends PlatformPost{
    {
        super.api="/platform/supplierMgr/getSupplierByPage"
        super.params = ["condition","order","page","rows","sort"]
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
