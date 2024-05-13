package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class DeleteShipperInfo extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/SupplierManage/deleteShipperAddressInfo"
        super.params =  [ "id","supplierId","supplierName"]
    }
    DeleteShipperInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    DeleteShipperInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    DeleteShipperInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
