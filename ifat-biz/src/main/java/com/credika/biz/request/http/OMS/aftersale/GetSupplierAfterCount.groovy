package com.credika.biz.request.http.OMS.aftersale
import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetSupplierAfterCount extends OMSPost {
    {
        super.api = "AftersalesDetailManage/getSupplierAfterCount"
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
