package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateShipperInfo extends PlatformPost {
    {
        super.api = "/SupplierManage/updateShipperInfo"
        super.params =["id","supplierId","shipperAddress","shipperAddressDetail","shipperName","shipperPhone","supplierCode","isDefault","supplierName"]
    }
    UpdateShipperInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    UpdateShipperInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    UpdateShipperInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
