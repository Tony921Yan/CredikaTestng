package com.miyuan.test.api.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.order.CenterGetOrderList
import org.testng.annotations.Test

class CenterGetOrderFailListTest extends BaseTest{
    CenterGetOrderList centerGetOrderFailList = new CenterGetOrderList()
    @Test(description = "查询失效自购订单" ,groups = ["prod","uat"],testName = "centerGetFailOrderListSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerGetFailOrderListSuccess(TestContext testContext){
        centerGetOrderFailList.invoke(testContext)
        // centerGetOrderFailList.invoke(testContext).baseAssert(testContext)
        centerGetOrderFailList.failCaseShowAssert(testContext)
        centerGetOrderFailList.PrivacyOrderAssert(testContext)
        centerGetOrderFailList.specialAssert(testContext)
        centerGetOrderFailList.tbOrderTypeAssert(testContext)
    }
}


