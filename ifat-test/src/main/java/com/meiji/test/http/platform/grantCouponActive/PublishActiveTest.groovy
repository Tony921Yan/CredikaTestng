package com.meiji.test.http.platform.grantCouponActive
import com.meiji.biz.request.http.platform.grantCouponActive.PublishActive
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PublishActiveTest extends BaseTest {
    PublishActive publishActive = new PublishActive()
    @Test(description = "发布活动 publishActive" ,groups = ["prod","uat"],testName = "publishActive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void publishActive(TestContext testContext){
        publishActive.invoke(testContext).baseAssert(testContext)
    }
}