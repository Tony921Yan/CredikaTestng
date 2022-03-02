package com.meiji.test.http.platform.grantCouponActive
import com.meiji.biz.request.http.platform.grantCouponActive.AddActive
import com.meiji.biz.request.http.platform.grantCouponActive.UpdateActive
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateActiveTest extends BaseTest {
    UpdateActive updateActive = new UpdateActive()
    @Test(description = "修改兑券活动 updateActive" ,groups = ["prod","uat"],testName = "updateActive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateActive(TestContext testContext){
        updateActive.invoke(testContext).baseAssert(testContext)
    }
}