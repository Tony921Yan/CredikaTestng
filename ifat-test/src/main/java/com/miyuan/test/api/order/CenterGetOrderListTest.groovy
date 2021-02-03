package com.miyuan.test.api.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.order.CenterGetOrderList
import org.testng.annotations.Test

class CenterGetOrderListTest extends BaseTest{
    CenterGetOrderList centerGetOrderList = new CenterGetOrderList()
    @Test(description = "查询订单" ,groups = ["prod","uat"],testName = "centerGetOrderListSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerGetOrderListSuccess(TestContext testContext){
        centerGetOrderList.invoke(testContext)
        centerGetOrderList.specialAssert(testContext)
        centerGetOrderList.failCaseShowAssert(testContext)
        centerGetOrderList.PrivacyOrderAssert(testContext)
        centerGetOrderList.tbOrderTypeAssert(testContext)
    }
}


