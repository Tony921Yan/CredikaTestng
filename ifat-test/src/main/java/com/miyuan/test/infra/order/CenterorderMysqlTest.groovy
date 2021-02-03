package com.miyuan.test.infra.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.order.CenterMysqlOrderList
import org.testng.annotations.Test

class CenterorderMysqlTest extends BaseTest{
    CenterMysqlOrderList centerGetMsqlOrderList = new CenterMysqlOrderList()
    @Test(description = "查询oms_com_income_result订单" ,groups = ["prod","prod"],testName = "centerGetOrderListSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerGetMsqlOrderListSuccess(TestContext testContext){
        centerGetMsqlOrderList.invoke(testContext)
        centerGetMsqlOrderList.OrderResultAssert(testContext)
        centerGetMsqlOrderList.OrderItemAssert(testContext)
       /* centerGetMsqlOrderList.testAssert(testContext)*/
    }


}


