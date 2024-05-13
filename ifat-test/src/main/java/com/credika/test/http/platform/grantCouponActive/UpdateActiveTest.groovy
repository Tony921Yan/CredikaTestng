package com.credika.test.http.platform.grantCouponActive
import com.credika.biz.request.http.platform.grantCouponActive.UpdateActive
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateActiveTest extends BaseTest {
    UpdateActive updateActive = new UpdateActive()
    @Test(description = "修改兑券活动 updateActive" ,groups = ["prod","uat"],testName = "updateActive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateActive(TestContext testContext){
        if(MysqlService.grantCouponActiveID("2") != null){
            testContext.put("id",MysqlService.grantCouponActiveID("2") != null)
            updateActive.invoke(testContext).baseAssert(testContext)
        }
        }
}
