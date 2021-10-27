package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ProdAddShipperAddressInfo extends PlatformPost {
    {
        super.api = "/SupplierManage/addShipperAddressInfo"
        super.params =  [ "supplierId","shipperAddress","shipperAddressDetail","shipperName","shipperPhone","supplierCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }
    ProdAddShipperAddressInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    ProdAddShipperAddressInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    ProdAddShipperAddressInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
