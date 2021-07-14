package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.Login
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class LoginTest extends BaseTest {
    Login login = new Login()
    @Test(description = "C端小程序登录 login" ,groups = ["prod","uat"],testName = "mall-login",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void login(TestContext testContext){
        login.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
