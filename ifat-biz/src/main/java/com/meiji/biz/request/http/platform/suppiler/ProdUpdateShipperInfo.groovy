package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ProdUpdateShipperInfo extends PlatformPost {
    {
        super.api = "/SupplierManage/updateShipperInfo"
        super.params =  ["id","supplierId","shipperAddress","shipperAddressDetail","shipperName","shipperPhone","supplierCode","isDefault","supplierName"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }
    ProdUpdateShipperInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    ProdUpdateShipperInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    ProdUpdateShipperInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
