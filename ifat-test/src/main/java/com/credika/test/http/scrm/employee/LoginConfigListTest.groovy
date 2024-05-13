package com.credika.test.http.scrm.employee

import com.credika.biz.request.http.scrm.employee.LoginConfigList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-15:42
 */
class LoginConfigListTest extends BaseTest {
    LoginConfigList loginConfigList = new LoginConfigList()

    @Test(description = "查看登录配置成员列表", groups = ["prod", "uat"], testName = "loginConfigList",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        loginConfigList.invoke(testContext).baseAssert(testContext)
    }
}
