package com.credika.test.http.platform.supplier
import com.credika.biz.request.http.platform.suppiler.UpdateBank
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateBankTest extends BaseTest {
    UpdateBank updateBank = new UpdateBank()
    @Test(description = "更新银行信息 updateBank" ,groups = ["prod","uat"],testName = "updateBank",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateBank(TestContext testContext){
        updateBank.invoke(testContext).baseAssert(testContext)
    }
}
