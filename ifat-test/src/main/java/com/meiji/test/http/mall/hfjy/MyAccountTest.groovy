package com.meiji.test.http.mall.hfjy
import com.meiji.biz.request.http.mall.hfjy.MyAccount
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MyAccountTest extends BaseTest {
    MyAccount myAccount = new MyAccount()
    @Test(description = "查询个人账户 myAccount" ,groups = ["prod","uat"],testName = "myAccount",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void myAccount(TestContext testContext){
        myAccount.invoke(testContext).baseAssert(testContext)
    }
}