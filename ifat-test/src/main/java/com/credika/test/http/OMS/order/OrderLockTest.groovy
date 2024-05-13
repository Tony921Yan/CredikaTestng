package com.credika.test.http.OMS.order
import com.credika.biz.request.http.OMS.order.OrderLock
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class OrderLockTest extends BaseTest {
    OrderLock orderLock = new OrderLock()
    @Test(description = "锁单 orderLock" ,groups = ["prod","uat"],testName = "orderLock",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void orderLock(TestContext testContext){
        orderLock.invoke(testContext).baseAssert(testContext)
    }
}
