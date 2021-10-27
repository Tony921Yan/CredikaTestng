package com.meiji.biz.request.http.OMS.supplier

import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class GetSupplierInfo extends OMSGet {
    {
        super.api = "/api/supplier/supplierMgr/getSupplierInfo"
        super.params =  [ "phone"]

    }

    GetSupplierInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSupplierInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSupplierInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
