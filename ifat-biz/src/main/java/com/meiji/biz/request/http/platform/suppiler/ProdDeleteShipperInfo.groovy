package com.meiji.biz.request.http.platform.suppiler

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ProdDeleteShipperInfo extends PlatformPost {
    {
        super.api = "/SupplierManage/deleteShipperAddressInfo"
        super.params =  [ "id","supplierId","supplierName"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }
    ProdDeleteShipperInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    ProdDeleteShipperInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    ProdDeleteShipperInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
