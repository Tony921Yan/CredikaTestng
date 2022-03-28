package com.meiji.test.http.platform.stockManger

import com.meiji.biz.request.http.platform.stockManger.SubmitAllotBill
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SubmitAllotBillTest extends BaseTest {
    SubmitAllotBill submitAllotBill = new SubmitAllotBill()
    @Test(description = "提交调拨单,submitAllotBill ", groups = ["prod", "uat"], testName = "submitAllotBill",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void submitAllotBill(TestContext testContext) {
        submitAllotBill.invoke(testContext).baseAssert(testContext)
    }
}


