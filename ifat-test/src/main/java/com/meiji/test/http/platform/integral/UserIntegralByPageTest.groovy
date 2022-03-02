package com.meiji.test.http.platform.integral
import com.meiji.biz.request.http.platform.integral.UserIntegralByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UserIntegralByPageTest extends BaseTest {
    UserIntegralByPage userIntegralByPage = new UserIntegralByPage()
    @Test(description = "用户积分分页查询 userIntegralByPage" ,groups = ["prod","uat"],testName = "userIntegralByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void userIntegralByPage(TestContext testContext){
        userIntegralByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
