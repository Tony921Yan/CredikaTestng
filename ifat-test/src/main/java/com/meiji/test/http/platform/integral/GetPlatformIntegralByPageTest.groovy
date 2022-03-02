package com.meiji.test.http.platform.integral

import com.meiji.biz.request.http.platform.integral.GetPlatformIntegralByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetPlatformIntegralByPageTest extends BaseTest {
    GetPlatformIntegralByPage getPlatformIntegralByPage = new GetPlatformIntegralByPage()
    @Test(description = "获取平台积分流水 getPlatformIntegralByPage" ,groups = ["prod","uat"],testName = "getPlatformIntegralByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getPlatformIntegralByPage(TestContext testContext){
        getPlatformIntegralByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
