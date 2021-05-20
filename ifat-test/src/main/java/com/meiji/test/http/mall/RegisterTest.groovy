package com.meiji.test.http.mall

import com.meiji.biz.request.http.mall.Register
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class RegisterTest extends BaseTest {
    Register register = new Register()
    @Test(description = "C端小程序注册 register" ,groups = ["prod","uat"],testName = "mall-register",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void register(TestContext testContext){
        register.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
