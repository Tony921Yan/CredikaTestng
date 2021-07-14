package com.meiji.test.http.mall.orderInfo

import com.meiji.biz.request.http.mall.orderInfo.GetOrderLogisticsInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderLogisticsInfoTest extends BaseTest {
    GetOrderLogisticsInfo getOrderLogisticsInfo = new GetOrderLogisticsInfo()
    @Test(description = "获取物流信息 getOrderLogisticsInfo" ,groups = ["prod","uat"],testName = "getOrderLogisticsInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderLogisticsInfo(TestContext testContext){
        getOrderLogisticsInfo.invoke(testContext).baseAssert(testContext)
    }
}
