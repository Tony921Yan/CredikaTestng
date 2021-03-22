package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.GetOrderInfo
import org.testng.annotations.Test

class GetOrderInfoTest extends BaseTest {
    GetOrderInfo getOrderInfo = new GetOrderInfo()
    @Test(description = "订单详情 getOrderInfo" ,groups = ["prod","uat"],testName = "getOrderInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderInfo(TestContext testContext){
        getOrderInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
