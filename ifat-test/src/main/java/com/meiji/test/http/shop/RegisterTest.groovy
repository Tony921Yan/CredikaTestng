package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.Register
import org.testng.annotations.Test

class RegisterTest extends BaseTest {
    Register register = new Register()
    @Test(description = "B端小程序注册 register" ,groups = ["prod","uat"],testName = "register",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void register(TestContext testContext){
        register.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
