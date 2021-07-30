package com.meiji.test.http.shop.dealer

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.dealer.Login
import org.testng.annotations.Test

class LoginTest extends BaseTest {
    Login login = new Login()
    @Test(description = "B端小程序登录 login" ,groups = ["prod","uat"],testName = "login",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void login(TestContext testContext){
        login.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
