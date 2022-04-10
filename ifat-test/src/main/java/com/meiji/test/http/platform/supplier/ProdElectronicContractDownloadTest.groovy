package com.meiji.test.http.platform.supplier

import com.meiji.biz.request.http.platform.suppiler.ProdElectronicContractDownload
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ProdElectronicContractDownloadTest extends BaseTest {
    ProdElectronicContractDownload prodElectronicContractDownload = new ProdElectronicContractDownload()
    @Test(description = "合同下载 prodElectronicContractDownload" ,groups = ["prod","uat"],testName = "prodElectronicContractDownload",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void prodElectronicContractDownload(TestContext testContext){
        testContext.put("contractId",6)
        prodElectronicContractDownload.invoke(testContext).baseAssert(testContext)
        prodElectronicContractDownload.specialAssert(testContext)
    }
}
