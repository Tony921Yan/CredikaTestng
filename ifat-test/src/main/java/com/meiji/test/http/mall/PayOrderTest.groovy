package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.PageOrder
import com.meiji.request.http.mall.PayOrder
import org.testng.annotations.Test

class PayOrderTest extends BaseTest {
    PayOrder payOrder = new PayOrder()
    @Test(description = "支付订单 payOrder" ,groups = ["prod","uat"],testName = "payOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void payOrder(TestContext testContext){
        payOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
