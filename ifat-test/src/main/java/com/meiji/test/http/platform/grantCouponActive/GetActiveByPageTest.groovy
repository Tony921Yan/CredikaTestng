package com.meiji.test.http.platform.grantCouponActive
import com.meiji.biz.request.http.platform.grantCouponActive.GetActiveByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetActiveByPageTest extends BaseTest {
    GetActiveByPage getActiveByPage = new GetActiveByPage()
    @Test(description = "获取活动数据 getActiveByPage" ,groups = ["prod","uat"],testName = "getActiveByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActiveByPage(TestContext testContext){
        getActiveByPage.invoke(testContext).baseAssert(testContext)
    }
}