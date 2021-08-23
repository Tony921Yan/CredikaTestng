package com.meiji.test.http.scrm.register

import com.meiji.biz.request.http.scrm.register.AuthResult
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-11:09
 */
class AuthResultTest extends BaseTest {
    AuthResult authResult = new AuthResult()
    @Test(description = "授权结果（轮询） authResult" ,groups = ["prod","uat"],testName = "authResult",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        authResult.invoke(testContext).baseAssert(testContext)
    }
}
