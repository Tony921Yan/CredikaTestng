package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderInfoTest extends BaseTest {
    com.meiji.biz.request.http.mall.GetOrderInfo getOrderInfo = new com.meiji.biz.request.http.mall.GetOrderInfo()
    @Test(description = "订单详情 getOrderInfo" ,groups = ["prod","uat"],testName = "getOrderInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderInfo(TestContext testContext){
        getOrderInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
