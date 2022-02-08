package com.meiji.test.http.scrm.login

import com.meiji.biz.request.http.scrm.login.Login
import com.meiji.biz.request.http.scrm.login.LoginScan
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-9:45
 */
class LoginScanTest extends BaseTest {

    LoginScan loginScan = new LoginScan()
    @Test(description = "扫码登录接口 loginscan" ,groups = ["prod","uat"],testName = "loginscan",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        loginScan.invoke(testContext).specialAssert(testContext)
    }

}
