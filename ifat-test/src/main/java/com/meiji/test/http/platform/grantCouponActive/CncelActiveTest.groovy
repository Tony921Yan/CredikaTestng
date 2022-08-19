package com.meiji.test.http.platform.grantCouponActive
import com.meiji.biz.request.http.platform.grantCouponActive.CncelActive
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CncelActiveTest extends BaseTest {
    CncelActive cncelActive = new CncelActive()
    @Test(description = "取消活动 cncelActive" ,groups = ["prod","uat"],testName = "cncelActive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cncelActive(TestContext testContext){
        testContext.put("id", MysqlService.grantCouponActiveID("4"))
        cncelActive.invoke(testContext).baseAssert(testContext)
    }
}