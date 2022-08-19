package com.meiji.test.http.platform.grantCouponActive
import com.meiji.biz.request.http.platform.grantCouponActive.SubmitActive
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SubmitActiveTest extends BaseTest {
    SubmitActive submitActive = new SubmitActive()
    @Test(description = "提交活动 submitActive" ,groups = ["prod","uat"],testName = "submitActive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void submitActive(TestContext testContext){
        testContext.put("id", MysqlService.grantCouponActiveID("2"))
        submitActive.invoke(testContext).baseAssert(testContext)
    }
}