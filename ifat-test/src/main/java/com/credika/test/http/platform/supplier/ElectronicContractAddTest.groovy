package com.credika.test.http.platform.supplier
import com.credika.biz.request.http.platform.suppiler.ElectronicContractAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ElectronicContractAddTest extends BaseTest {
    ElectronicContractAdd electronicContractAdd = new ElectronicContractAdd()
    @Test(description = "保存合同-提交合同 electronicContractAdd" ,groups = ["prod","uat"],testName = "electronicContractAdd",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void electronicContractAdd(TestContext testContext){
        electronicContractAdd.invoke(testContext).baseAssert(testContext)
    }
}
