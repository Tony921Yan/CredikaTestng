package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class AddShipperAddressInfo extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/SupplierManage/addShipperAddressInfo"
        super.params =  [ "supplierId","shipperAddress","shipperAddressDetail","shipperName","shipperPhone","supplierCode"]
    }
    AddShipperAddressInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    AddShipperAddressInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    AddShipperAddressInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
