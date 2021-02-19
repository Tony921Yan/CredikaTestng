package com.meiji.test.api.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.order.CenterGetOrderList
import org.testng.annotations.Test

class CenterGetTeamsOrderListTest extends BaseTest{
    CenterGetOrderList TeamsOrderAssert = new CenterGetOrderList()
    @Test(description = "查询团队订单" ,groups = ["prod","uat"],testName = "centerGetTeamsOrderListSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerGetFailOrderListSuccess(TestContext testContext){
        TeamsOrderAssert.invoke(testContext)
        TeamsOrderAssert.specialAssert(testContext)
        TeamsOrderAssert.TeamsOrderAssert(testContext)
        TeamsOrderAssert .failCaseShowAssert(testContext)
        TeamsOrderAssert.PrivacyOrderAssert(testContext)
        TeamsOrderAssert.tbOrderTypeAssert(testContext)
    }
}


