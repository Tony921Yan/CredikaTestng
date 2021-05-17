package com.meiji.test.http.order

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.order.CancelOrder
import org.testng.annotations.Test

class CancelOrderTest extends BaseTest {
    CancelOrder cancelOrder = new CancelOrder() //表order_info 提前条件：order_status=1 ,执行后order_status = 8;
    @Test(description = "取消订单 cancelOrder" ,groups = ["prod","uat"],testName = "cancelOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cancelOrder(TestContext testContext){
        cancelOrder.invoke(testContext).baseAssert(testContext)
    }
}
