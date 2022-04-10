package com.meiji.test.http.platform.supplier

import com.meiji.biz.request.http.platform.suppiler.ProdElectronicContractdetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ProdElectronicContractdetailTest extends BaseTest {
    ProdElectronicContractdetail prodElectronicContractdetail = new ProdElectronicContractdetail()
    @Test(description = "合同明细查询 prodElectronicContractdetail" ,groups = ["prod","uat"],testName = "prodElectronicContractdetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void prodElectronicContractdetail(TestContext testContext){
        prodElectronicContractdetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
