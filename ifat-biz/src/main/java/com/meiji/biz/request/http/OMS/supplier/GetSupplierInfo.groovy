package com.meiji.biz.request.http.OMS.supplier

import com.meiji.biz.request.http.OMS.OMSGet
import com.miyuan.ifat.support.test.TestContext

class GetSupplierInfo extends OMSGet {
    {
        super.api = "/api/supplier/supplierMgr/getSupplierInfo"
        super.params =  [ "phone"]

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
