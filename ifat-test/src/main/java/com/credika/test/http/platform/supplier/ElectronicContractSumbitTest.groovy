package com.credika.test.http.platform.supplier
import com.credika.biz.request.http.platform.suppiler.ElectronicContractSumbit
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ElectronicContractSumbitTest extends BaseTest {
    ElectronicContractSumbit electronicContractSumbit = new ElectronicContractSumbit()
    @Test(description = "列表页提交合同 electronicContractSumbit" ,groups = ["prod","uat"],testName = "electronicContractSumbit",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void electronicContractSumbit(TestContext testContext){
        electronicContractSumbit.invoke(testContext).baseAssert(testContext)
    }
}
