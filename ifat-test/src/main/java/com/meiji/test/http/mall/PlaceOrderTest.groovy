package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.PlaceOrder
import org.testng.annotations.Test

class PlaceOrderTest extends BaseTest {
    PlaceOrder placeOrder = new PlaceOrder()
    @Test(description = "下单 placeOrder" ,groups = ["prod","uat"],testName = "placeOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void placeOrder(TestContext testContext){
        placeOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
