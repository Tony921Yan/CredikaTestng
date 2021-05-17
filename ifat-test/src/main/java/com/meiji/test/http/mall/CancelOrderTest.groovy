package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.AddUserAddress
import com.meiji.request.http.mall.CancelOrder
import org.testng.annotations.Test

class CancelOrderTest extends BaseTest {
    CancelOrder cancelOrder = new CancelOrder()
    @Test(description = "订单取消 cancelOrder" ,groups = ["prod","uat"],testName = "cancelOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cancelOrder(TestContext testContext){
        cancelOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
