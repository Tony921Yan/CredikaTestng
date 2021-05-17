package com.meiji.test.http.orderafter

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.orderafter.CheckGoods
import com.meiji.request.http.orderafter.ExportOrderAfter
import org.testng.annotations.Test

class ExportOrderAfterTest extends BaseTest {
    ExportOrderAfter exportOrderAfter = new ExportOrderAfter()
    @Test(description = "售后单导出 exportOrderAfter" ,groups = ["prod","uat"],testName = "exportOrderAfter",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void exportOrderAfter(TestContext testContext){
        exportOrderAfter.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
