package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class ProdElectronicContractDownload extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/ElectronicContract/download"
        super.params =  ["contractId"]
    }

    ProdElectronicContractDownload invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ProdElectronicContractDownload preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ProdElectronicContractDownload baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    ProdElectronicContractDownload specialAssert(TestContext testContext){
        Map mysqlDate = com.credika.biz.service.MysqlService.prodElectronicContractDownload(testContext.get("contractId")).get(0)
        Map apiData = testContext.getResponse()
        System.out.print("apiData:" + apiData)
        System.out.println("mysqlDate"+ mysqlDate)
        return this
    }
}