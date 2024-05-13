package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class GetSupplierDetail extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="SupplierManage/getSupplierDetail"
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
