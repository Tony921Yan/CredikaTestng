package com.meiji.biz.request.http.platform.suppiler
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class DeleteShipperInfo extends PlatformPost {
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
