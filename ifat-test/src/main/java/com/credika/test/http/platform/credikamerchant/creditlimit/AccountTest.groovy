package com.credika.test.http.platform.credikamerchant.creditlimit
import com.credika.biz.request.http.platform.credikamerchant.crad.Account
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 @author Remy
 @create 2024/11/18-20:20
 @version v2.1
 **/
class AccountTest extends BaseTest {
     Account account = new Account()
    @Test(description = "商户共享账户金额 account" ,groups = ["prod","uat"],testName = "account",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void account(TestContext testContext){
        account.invoke(testContext).baseAssert(testContext)
    }

}
