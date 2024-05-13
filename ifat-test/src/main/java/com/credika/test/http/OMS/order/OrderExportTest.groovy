package com.credika.test.http.OMS.order



import com.credika.biz.request.http.OMS.order.OrderExport
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class OrderExportTest extends BaseTest {
    OrderExport orderExport = new OrderExport()
    @Test(description = "订单导出 orderExport" ,groups = ["prod","uat"],testName = "OMSorderExport",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void orderExport(TestContext testContext){
        orderExport.invoke(testContext).baseAssert(testContext)
    }
}
