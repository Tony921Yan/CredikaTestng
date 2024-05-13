package com.credika.test.http.platform.credikamerchant.card
import com.credika.biz.request.http.platform.credikamerchant.crad.Account
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/18-20:20
 @version v2.1
 */
class AccountTest extends BaseTest {
     Account account = new Account()
    @Test(description = "商户账户 account" ,groups = ["prod","uat"],testName = "account",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void account(TestContext testContext){
        account.invoke(testContext).baseAssert(testContext)
    }

}
