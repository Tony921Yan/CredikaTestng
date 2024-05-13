package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class ProdElectronicContractdetail extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/ElectronicContract/detail"
        super.params =  [ "contractId"]
    }

    ProdElectronicContractdetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ProdElectronicContractdetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ProdElectronicContractdetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    ProdElectronicContractdetail specialAssert(TestContext testContext){
        Map mysqlDate = com.credika.biz.service.MysqlService.prodElectronicContractdetail(testContext.get("contractId")).get(0)
        Map apiData = testContext.getResponse().data
        System.out.print("apiData:" + apiData)
        assert mysqlDate.id == apiData.id
        assert mysqlDate.supplier_id == apiData.supplierId
        assert mysqlDate.supplier_mobile == apiData.supplierMobile
        return this
    }
}
