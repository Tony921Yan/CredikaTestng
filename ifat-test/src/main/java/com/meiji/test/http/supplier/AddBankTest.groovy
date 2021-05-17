package com.meiji.test.http.supplier

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.suppiler.AddBank
import org.testng.annotations.Test

class AddBankTest extends BaseTest {
    AddBank addBank = new AddBank()
    @Test(description = "添加银行信息 addBank" ,groups = ["prod","uat"],testName = "addBank",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addBank(TestContext testContext){
        addBank.invoke(testContext).baseAssert(testContext)
    }
}
