package com.meiji.biz.request.http.OMS.supplier

import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetSupplierDetail extends OMSPost {
    {
        super.api = "SupplierManage/getSupplierDetail"
        super.params =  [ "supplierId"]

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
