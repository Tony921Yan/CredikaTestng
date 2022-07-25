package com.meiji.test.http.OMS.account

import com.meiji.biz.request.http.OMS.account.Account
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AccountTest extends BaseTest {
    Account account = new Account()
    @Test(description = "账户资产 account" ,groups = ["prod","uat"],testName = "OMSaccount",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void account(TestContext testContext){
        account.invoke(testContext).baseAssert(testContext)
    }
}
