package com.meiji.test.http.platform.aftersalesDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.aftersalesDetailManage.ExportOrderAfter
import org.testng.annotations.Test

class ExportOrderAfterTest extends BaseTest {
    ExportOrderAfter exportOrderAfter = new ExportOrderAfter()
    @Test(description = "售后单导出 exportOrderAfter" ,groups = ["prod","uat"],testName = "exportOrderAfter-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void exportOrderAfter(TestContext testContext){
        exportOrderAfter.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
