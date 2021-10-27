package com.meiji.biz.request.http.platform.suppiler


import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ListFreightTemplateBySupplierId extends PlatformPost{
    {
        super.api="/platform/supplierMgr/getSupplierByPage"
        super.params = ["condition","order","page","rows","sort"]
    }

    ListFreightTemplateBySupplierId invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ListFreightTemplateBySupplierId preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ListFreightTemplateBySupplierId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
