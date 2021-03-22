package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.Register
import org.testng.annotations.Test

class RegisterTest extends BaseTest {
    Register register = new Register()
    @Test(description = "C端小程序注册 register" ,groups = ["prod","uat"],testName = "register",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void register(TestContext testContext){
        register.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
