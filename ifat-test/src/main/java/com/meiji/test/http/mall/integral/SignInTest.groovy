package com.meiji.test.http.mall.integral
import com.meiji.biz.request.http.mall.integral.SignIn
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
class SignInTest extends BaseTest{
    SignIn signIn = new SignIn()
    @Test(description = "签到 signIn" ,groups = ["prod","uat"],testName = "signIn",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelData(TestContext testContext){
        signIn.invoke(testContext).baseAssert(testContext)
    }
}
