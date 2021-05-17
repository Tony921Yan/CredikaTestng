package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PlaceOrderTest extends BaseTest {
    com.meiji.biz.request.http.mall.PlaceOrder placeOrder = new com.meiji.biz.request.http.mall.PlaceOrder()
    @Test(description = "下单 placeOrder" ,groups = ["prod","uat"],testName = "placeOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void placeOrder(TestContext testContext){
        placeOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
