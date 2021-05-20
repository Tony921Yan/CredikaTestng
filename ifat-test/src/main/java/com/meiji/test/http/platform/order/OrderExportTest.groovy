package com.meiji.test.http.platform.order

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.order.OrderExport
import org.testng.annotations.Test

class OrderExportTest extends BaseTest {
    OrderExport orderExport = new OrderExport()
    @Test(description = "订单导出 orderExport" ,groups = ["prod","uat"],testName = "orderExport",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void orderExport(TestContext testContext){
        orderExport.invoke(testContext).baseAssert(testContext)
    }
}
