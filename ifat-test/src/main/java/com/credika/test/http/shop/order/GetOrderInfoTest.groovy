package com.credika.test.http.shop.order

import com.credika.biz.request.http.shop.order.GetOrderInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderInfoTest extends BaseTest {
    GetOrderInfo getOrderInfo = new GetOrderInfo()
    @Test(description = "订单详情 getOrderInfo" ,groups = ["prod","uat"],testName = "getOrderInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderInfo(TestContext testContext){
        getOrderInfo.invoke(testContext).baseAssert(testContext)
    }
}
