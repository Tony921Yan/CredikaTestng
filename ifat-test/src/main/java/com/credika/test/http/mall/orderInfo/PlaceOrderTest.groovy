package com.credika.test.http.mall.orderInfo

import com.credika.biz.request.http.mall.orderInfo.PlaceOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PlaceOrderTest extends BaseTest {
    PlaceOrder placeOrder = new PlaceOrder()
    @Test(description = "下单 placeOrder" ,groups = ["prod","uat"],testName = "placeOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void placeOrder(TestContext testContext){
        placeOrder.invoke(testContext).baseAssert(testContext)
    }
}
