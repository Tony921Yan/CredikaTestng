package com.credika.test.http.mall.orderInfo

import com.credika.biz.request.http.mall.orderInfo.PayOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PayOrderTest extends BaseTest {
    PayOrder payOrder = new PayOrder()
    @Test(description = "支付订单 payOrder" ,groups = ["prod","uat"],testName = "payOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void payOrder(TestContext testContext){
        payOrder.invoke(testContext).baseAssert(testContext)
    }
}
