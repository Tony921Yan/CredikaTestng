package com.credika.test.http.platform.grantCouponActive
import com.credika.biz.request.http.platform.grantCouponActive.AddActive
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddActiveTest extends BaseTest {
    AddActive addActive = new AddActive()
    @Test(description = "任务创建 addActive" ,groups = ["prod","uat"],testName = "addActive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addActive(TestContext testContext){
        addActive.invoke(testContext).baseAssert(testContext)
    }
}