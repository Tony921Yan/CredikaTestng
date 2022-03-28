package com.meiji.test.http.platform.stockManger
import com.meiji.biz.request.http.platform.stockManger.UpdateAllotBill
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateAllotBillTest extends BaseTest {
    UpdateAllotBill updateAllotBill = new UpdateAllotBill()
    @Test(description = "修改调拨单,updateAllotBill ", groups = ["prod", "uat"], testName = "updateAllotBill",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void updateAllotBill(TestContext testContext) {
        updateAllotBill.invoke(testContext).baseAssert(testContext)
    }
}


