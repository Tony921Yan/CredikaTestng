package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class LoginTest extends BaseTest {
    com.meiji.biz.request.http.mall.Login login = new com.meiji.biz.request.http.mall.Login()
    @Test(description = "C端小程序登录 login" ,groups = ["prod","uat"],testName = "login",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void login(TestContext testContext){
        login.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
