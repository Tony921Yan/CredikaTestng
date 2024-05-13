package com.credika.test.http.mall.orderInfo

import com.credika.biz.request.http.mall.orderInfo.GetOrderInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderInfoTest extends BaseTest {
    GetOrderInfo getOrderInfo = new GetOrderInfo()
    @Test(description = "订单详情 getOrderInfo" ,groups = ["prod","uat"],testName = "getOrderInfo1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderInfo(TestContext testContext){
        getOrderInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "订阅订单详情 getOrderInfo" ,groups = ["prod","uat"],testName = "getOrderInfo2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderInfo2(TestContext testContext){
        getOrderInfo.invoke(testContext).baseAssert(testContext)
    }
}
