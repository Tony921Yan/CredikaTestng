package com.miyuan.test.infra.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.infra.order.CenterGetOrderListnew
import org.testng.annotations.Test

class CenterGetAllNewOrderListTest extends BaseTest{
    CenterGetOrderListnew centerGetAllNewOrderList = new CenterGetOrderListnew()
    @Test(description = "查询新架构全部订单" ,groups = ["prod","prod"],testName = "centerGetAllNewOrderListSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerGetFailOrderListSuccess(TestContext testContext){
        centerGetAllNewOrderList.invoke(testContext)
       // centerGetAllNewOrderList.baseAssert(testContext)
        centerGetAllNewOrderList.specialAssert(testContext)
        centerGetAllNewOrderList.commissionnAssert(testContext)
        centerGetAllNewOrderList.PrivacyOrderAssert(testContext)
    }

}


