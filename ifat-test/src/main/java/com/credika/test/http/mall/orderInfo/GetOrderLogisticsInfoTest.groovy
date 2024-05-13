package com.credika.test.http.mall.orderInfo

import com.credika.biz.request.http.mall.orderInfo.GetOrderLogisticsInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderLogisticsInfoTest extends BaseTest {
    GetOrderLogisticsInfo getOrderLogisticsInfo = new GetOrderLogisticsInfo()
    @Test(description = "获取物流信息 getOrderLogisticsInfo" ,groups = ["prod","uat"],testName = "getOrderLogisticsInfo1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderLogisticsInfo(TestContext testContext){
        getOrderLogisticsInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
