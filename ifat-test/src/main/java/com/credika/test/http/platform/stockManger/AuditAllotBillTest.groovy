package com.credika.test.http.platform.stockManger
import com.credika.biz.request.http.platform.stockManger.AuditAllotBill
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AuditAllotBillTest extends BaseTest {
    AuditAllotBill auditAllotBill = new AuditAllotBill()

    @Test(description = "审核调拨单-不通过,auditAllotBill1 ", groups = ["prod", "uat"], testName = "auditAllotBill1",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void auditAllotBill1(TestContext testContext) {
        auditAllotBill.invoke(testContext).baseAssert(testContext)
    }
    @Test(description = "审核调拨单-通过,auditAllotBill2", groups = ["prod", "uat"], testName = "auditAllotBill2",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void auditAllotBill2(TestContext testContext) {
        auditAllotBill.invoke(testContext).baseAssert(testContext)
    }
}


