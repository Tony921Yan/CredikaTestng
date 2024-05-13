package com.credika.test.http.platform.orderDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.orderDetailManage.GetOrderLogisticsInfo
import org.testng.annotations.Test

class GetOrderLogisticsInfoTest extends BaseTest {
    GetOrderLogisticsInfo getOrderLogisticsInfo = new GetOrderLogisticsInfo()
    @Test(description = "获取物流信息 getOrderLogisticsInfo" ,groups = ["prod","uat"],testName = "getOrderLogisticsInfo-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderLogisticsInfo(TestContext testContext){
        getOrderLogisticsInfo.invoke(testContext).baseAssert(testContext)
    }
}
