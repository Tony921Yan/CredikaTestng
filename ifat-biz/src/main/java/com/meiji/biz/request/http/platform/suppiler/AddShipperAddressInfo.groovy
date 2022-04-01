package com.meiji.biz.request.http.platform.suppiler
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddShipperAddressInfo extends PlatformPost {
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
