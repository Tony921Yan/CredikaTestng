package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.ElectronicContractExtSign
import com.meiji.biz.request.http.platform.other.ProdQueryPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ElectronicContractExtSignTest extends BaseTest {
    ElectronicContractExtSign electronicContractExtSign = new ElectronicContractExtSign()
    @Test(description = "合同签署 electronicContractExtSign" ,groups = ["prod","uat"],testName = "electronicContractExtSign",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void electronicContractExtSign(TestContext testContext){
        electronicContractExtSign.invoke(testContext).baseAssert(testContext)
    }
}
