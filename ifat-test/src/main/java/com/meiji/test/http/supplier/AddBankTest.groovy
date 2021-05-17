package com.meiji.test.http.supplier

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.suppiler.AddBank
import org.testng.annotations.Test

class AddBankTest extends BaseTest {
    AddBank addBank = new AddBank()
    @Test(description = "添加银行信息 addBank" ,groups = ["prod","uat"],testName = "addBank",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addBank(TestContext testContext){
        addBank.invoke(testContext).baseAssert(testContext)
    }
}
