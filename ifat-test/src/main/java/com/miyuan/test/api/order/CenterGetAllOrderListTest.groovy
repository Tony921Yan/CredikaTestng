package com.miyuan.test.api.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.order.CenterGetOrderList
import org.testng.annotations.Test

class CenterGetAllOrderListTest extends BaseTest{
    CenterGetOrderList centerGetAllOrderList = new CenterGetOrderList()
    @Test(description = "查询全部订单" ,groups = ["prod","uat"],testName = "centerGetAllOrderListSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerGetFailOrderListSuccess(TestContext testContext){
        centerGetAllOrderList.invoke(testContext)
        //centerGetAllOrderList.failCaseShowAssert(testContext)
        centerGetAllOrderList.specialAssert(testContext)
        //centerGetAllOrderList.PrivacyOrderAssert(testContext)
        centerGetAllOrderList.tbOrderTypeAssert(testContext)
        centerGetAllOrderList.SettlementTimeAssert(testContext)
    }
}


