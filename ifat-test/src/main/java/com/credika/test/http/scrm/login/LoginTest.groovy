package com.credika.test.http.scrm.login

import com.credika.biz.request.http.scrm.login.Login
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-9:45
 */
class LoginTest extends BaseTest {

    Login login = new Login()
    @Test(description = "企业账号密码登陆 login" ,groups = ["prod","uat"],testName = "login",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        login.invoke(testContext).specialAssert(testContext)
    }
}
