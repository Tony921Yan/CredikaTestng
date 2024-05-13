package com.credika.test.http.platform.integral
import com.credika.biz.request.http.platform.integral.CorrectUserIntegral
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CorrectUserIntegralTest extends BaseTest {
   CorrectUserIntegral correctUserIntegral = new CorrectUserIntegral()
    @Test(description = "用户积分增加或扣减 correctUserIntegral" ,groups = ["prod","uat"],testName = "correctUserIntegral",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void correctUserIntegral(TestContext testContext){
        correctUserIntegral.invoke(testContext).baseAssert(testContext)
    }
}
