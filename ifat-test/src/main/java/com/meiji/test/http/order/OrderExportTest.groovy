package com.meiji.test.http.order

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.order.CancelOrder
import com.meiji.request.http.order.OrderExport
import org.testng.annotations.Test

class OrderExportTest extends BaseTest {
    OrderExport orderExport = new OrderExport()
    @Test(description = "订单导出 orderExport" ,groups = ["prod","uat"],testName = "orderExport",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void orderExport(TestContext testContext){
        orderExport.invoke(testContext).baseAssert(testContext)
    }
}
