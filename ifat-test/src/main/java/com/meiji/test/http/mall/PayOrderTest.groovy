package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PayOrderTest extends BaseTest {
    com.meiji.biz.request.http.mall.PayOrder payOrder = new com.meiji.biz.request.http.mall.PayOrder()
    @Test(description = "支付订单 payOrder" ,groups = ["prod","uat"],testName = "payOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void payOrder(TestContext testContext){
        payOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
