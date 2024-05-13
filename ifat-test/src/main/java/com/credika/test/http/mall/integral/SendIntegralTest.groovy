package com.credika.test.http.mall.integral
import com.credika.biz.request.http.mall.integral.SendIntegral
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SendIntegralTest extends BaseTest{
    SendIntegral sendIntegral = new SendIntegral()
    @Test(description = "发放积分 sendIntegral" ,groups = ["prod","uat"],testName = "sendIntegral",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void sendIntegral(TestContext testContext){
        testContext.put("taskId", MysqlService.sendIntegralTaskId1())
        testContext.put("taskType",MysqlService.sendIntegralTaskId2())
        sendIntegral.invoke(testContext).baseAssert(testContext)
    }
}
