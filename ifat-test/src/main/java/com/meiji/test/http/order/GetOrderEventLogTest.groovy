package com.meiji.test.http.order

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.order.GetOrderEventLog
import org.testng.annotations.Test

class GetOrderEventLogTest extends BaseTest {
    GetOrderEventLog getOrderEventLog = new GetOrderEventLog()
    @Test(description = "获取订单日志 getOrderEventLog" ,groups = ["prod","uat"],testName = "getOrderEventLog",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderEventLog(TestContext testContext){
        getOrderEventLog.invoke(testContext).baseAssert(testContext)
    }
}
