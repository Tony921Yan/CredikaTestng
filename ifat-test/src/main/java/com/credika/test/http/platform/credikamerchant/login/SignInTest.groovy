package com.credika.test.http.platform.credikamerchant.login

import com.credika.biz.request.http.platform.credikamerchant.login.SignIn
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/18-20:20
 @version v2.1
 */
class SignInTest extends BaseTest {
  SignIn signIn = new SignIn()
    @Test(description = "商户登陆 signIn" ,groups = ["prod","uat"],testName = "signIn",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void signIn(TestContext testContext){
        testContext.put("username",'10000ntjzzzx@gmail.com')
        testContext.put("password",'10000ntjzzzx@gmail.com')
        signIn.invoke(testContext).baseAssert(testContext)
    }

}
