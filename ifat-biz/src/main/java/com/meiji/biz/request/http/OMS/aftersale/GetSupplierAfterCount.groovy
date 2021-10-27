package com.meiji.biz.request.http.OMS.aftersale

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetSupplierAfterCount extends OMSPost {
    {
        super.api = "/api/supplier/orderAfterMgr/getSupplierAfterCount"
        super.params =  [ "supplierId"]

    }

    GetSupplierAfterCount invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSupplierAfterCount preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSupplierAfterCount baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
