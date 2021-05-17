package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CancelOrderTest extends BaseTest {
    com.meiji.biz.request.http.mall.CancelOrder cancelOrder = new com.meiji.biz.request.http.mall.CancelOrder()
    @Test(description = "订单取消 cancelOrder" ,groups = ["prod","uat"],testName = "cancelOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cancelOrder(TestContext testContext){
        cancelOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
