package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class ProdElectronicContractdetail extends PlatformPost {
    {
        super.api = "/ElectronicContract/detail"
        super.params =  [ "contractId"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
    PlatformPost specialAssert(TestContext testContext){
        Map mysqlDate = MysqlService.prodElectronicContractdetail(testContext.get("contractId")).get(0)
        Map apiData = testContext.getResponse().data
        System.out.print("apiData:" + apiData)
        assert mysqlDate.id == apiData.id
        assert mysqlDate.supplier_id == apiData.supplierId
        assert mysqlDate.supplier_mobile == apiData.supplierMobile
    }
}