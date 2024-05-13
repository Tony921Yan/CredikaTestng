package com.credika.test.http.platform.stockManger
import com.credika.biz.request.http.platform.stockManger.CancelAllotBill
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CancelAllotBillTest extends BaseTest {
    CancelAllotBill cancelAllotBill = new CancelAllotBill()
    @Test(description = "取消调拨单 cancelAllotBill " ,groups = ["prod","uat"],testName = "cancelAllotBill",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cancelAllotBill(TestContext testContext){
        cancelAllotBill.invoke(testContext).baseAssert(testContext)
    }
}
