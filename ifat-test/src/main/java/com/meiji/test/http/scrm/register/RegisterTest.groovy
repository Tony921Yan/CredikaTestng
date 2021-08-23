package com.meiji.test.http.scrm.register

import com.meiji.biz.request.http.scrm.ScrmGet
import com.meiji.biz.request.http.scrm.register.AuthResult
import com.meiji.biz.request.http.scrm.register.Register
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-11:09
 */
class RegisterTest extends BaseTest {
    Register register = new Register()
    @Test(description = "授权结果（轮询） authResult" ,groups = ["prod","uat"],testName = "register",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        testContext.replace("phone","133" +testContext.get("phone").toString())
        register.invoke(testContext).baseAssert(testContext)
    }
}
