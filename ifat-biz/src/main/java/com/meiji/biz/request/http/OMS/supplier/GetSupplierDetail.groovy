package com.meiji.biz.request.http.OMS.supplier

import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class GetSupplierDetail extends OMSGet {
    {
        super.api = "/api/supplier/supplierMgr/getSupplierDetail"
        super.params =  [ "supplierId"]

    }

    OMSGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    OMSGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    OMSGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
