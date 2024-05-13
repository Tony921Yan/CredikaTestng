package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetSupplierReturnAddressBySupplierId extends PlatformPost{
    {
        super.api = "SupplierManage/getSupplierReturnAddressBySupplierId"
        super.params = ["id"]
    }

    GetSupplierReturnAddressBySupplierId invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSupplierReturnAddressBySupplierId preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSupplierReturnAddressBySupplierId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
