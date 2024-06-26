package com.credika.test.http.platform.supplier
import com.credika.biz.request.http.platform.suppiler.ElectronicContractUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ElectronicContractUpdateTest extends BaseTest {
    ElectronicContractUpdate electronicContractUpdate = new ElectronicContractUpdate()
    @Test(description = "修改合同 electronicContractUpdate" ,groups = ["prod","uat"],testName = "electronicContractUpdate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void electronicContractUpdate(TestContext testContext){
        electronicContractUpdate.invoke(testContext).baseAssert(testContext)
    }
}
