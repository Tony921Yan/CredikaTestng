package com.meiji.test.http.platform.grantCouponActive
import com.meiji.biz.request.http.platform.grantCouponActive.UserIntegralCouponByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UserIntegralCouponByPageTest extends BaseTest {
    UserIntegralCouponByPage userIntegralCouponByPage = new UserIntegralCouponByPage()
    @Test(description = "兑换详情 userIntegralCouponByPage" ,groups = ["prod","uat"],testName = "userIntegralCouponByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void userIntegralCouponByPage(TestContext testContext){
        userIntegralCouponByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}