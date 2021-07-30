package com.meiji.test.http.shop.dealer

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.dealer.Register
import org.testng.annotations.Test

class RegisterTest extends BaseTest {
    Register register = new Register()
    @Test(description = "B端小程序注册 register" ,groups = ["prod","uat"],testName = "register",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void register(TestContext testContext){
        register.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
