package com.credika.test.http.platform.orderDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.orderDetailManage.CancelOrder
import org.testng.annotations.Test

class CancelOrderTest extends BaseTest {
    CancelOrder cancelOrder = new CancelOrder()
    @Test(description = "取消订单-异常场景：线上1413748539523104 cancelOrder" ,groups = ["prod","uat"],testName = "cancelOrder-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cancelOrder(TestContext testContext){
        cancelOrder.invoke(testContext).baseAssert(testContext)
    }
}
