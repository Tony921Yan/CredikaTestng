package com.meiji.test.http.platform.accountmanager


import com.meiji.biz.request.http.platform.accountmanager.AccountAssetPageQuery
import com.meiji.biz.request.http.platform.accountmanager.OrderRecordExport
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class OrderRecordExportTest extends BaseTest {
    OrderRecordExport orderRecordExport = new OrderRecordExport()
    @Test(description = "订单记录导出 orderRecordExport" ,groups = ["prod","uat"],testName = "orderRecordExport",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void orderRecordExport(TestContext testContext){
        orderRecordExport.invoke(testContext).baseAssert(testContext)
    }
}
