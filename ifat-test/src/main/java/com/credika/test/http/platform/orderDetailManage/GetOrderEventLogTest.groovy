package com.credika.test.http.platform.orderDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.orderDetailManage.GetOrderEventLog
import org.testng.annotations.Test

class GetOrderEventLogTest extends BaseTest {
    GetOrderEventLog getOrderEventLog = new GetOrderEventLog()
    @Test(description = "获取订单日志 getOrderEventLog" ,groups = ["prod","uat"],testName = "getOrderEventLog-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderEventLog(TestContext testContext){
        getOrderEventLog.invoke(testContext).baseAssert(testContext)
    }
}
