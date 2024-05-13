package com.credika.test.http.OMS.aftersale

import com.credika.biz.request.http.OMS.aftersale.SyncAfterReport
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SyncAfterReportTest extends BaseTest {
    SyncAfterReport syncAfterReport = new SyncAfterReport()
    @Test(description = "同步售后上报 syncAfterReport" ,groups = ["prod","uat"],testName = "OMSsyncAfterReport",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void syncAfterReport(TestContext testContext){
        syncAfterReport.invoke(testContext).baseAssert(testContext)
    }
}
