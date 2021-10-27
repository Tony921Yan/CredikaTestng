package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class ProdElectronicContractDownload extends PlatformPost {
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
        Map mysqlDate = MysqlService.prodElectronicContractDownload(testContext.get("contractId")).get(0)
        Map apiData = testContext.getResponse()
        System.out.print("apiData:" + apiData)
        System.out.println("mysqlDate"+ mysqlDate)
        return this
    }
}