package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class GetSupplierByNameOrCode extends com.credika.biz.request.http.platform.PlatformGet{
    {
        super.api="/platform/supplierMgr/getSupplierByNameOrCode"
        super.params = ["codeOrName"]
    }

    GetSupplierByNameOrCode invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSupplierByNameOrCode preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSupplierByNameOrCode baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
