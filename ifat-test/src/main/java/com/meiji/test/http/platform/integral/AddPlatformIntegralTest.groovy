package com.meiji.test.http.platform.integral
import com.meiji.biz.request.http.platform.integral.AddPlatformIntegral
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddPlatformIntegralTest extends BaseTest {
    AddPlatformIntegral addPlatformIntegral = new AddPlatformIntegral()
    @Test(description = "增加总账积分 addPlatformIntegral" ,groups = ["prod","uat"],testName = "addPlatformIntegral",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void AddPlatformIntegral(TestContext testContext){
        addPlatformIntegral.invoke(testContext).baseAssert(testContext)
    }
}
