package com.meiji.test.api.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.order.CenterGetOrderList
import org.testng.annotations.Test

class CenterGetFansOrderListTest extends BaseTest{
    CenterGetOrderList FansOrderAssert = new CenterGetOrderList()
    @Test(description = "查询粉丝订单订单" ,groups = ["prod","uat"],testName = "centerGetFansOrderListSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerGetFailOrderListSuccess(TestContext testContext){
        FansOrderAssert.invoke(testContext)
        FansOrderAssert.PrivacyOrderAssert(testContext)
        FansOrderAssert.FansOrderAssert(testContext)
        FansOrderAssert.tbOrderTypeAssert(testContext)
    }
}


