package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.brand.BrandDetail
import com.meiji.request.http.shop.Login
import org.testng.annotations.Test

class LoginTest extends BaseTest {
    Login login = new Login()
    @Test(description = "B端小程序登录 login" ,groups = ["prod","uat"],testName = "login",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void login(TestContext testContext){
        login.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
