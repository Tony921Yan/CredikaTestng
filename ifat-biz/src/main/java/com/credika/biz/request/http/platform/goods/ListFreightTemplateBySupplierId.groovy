package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ListFreightTemplateBySupplierId extends PlatformPost{
    {
        super.api = "SupplierManage/listFreightTemplateBySupplierId"
        super.params = ["supplierId"]
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
