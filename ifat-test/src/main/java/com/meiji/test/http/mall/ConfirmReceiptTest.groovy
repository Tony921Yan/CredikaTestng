package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ConfirmReceiptTest extends BaseTest {
    com.meiji.biz.request.http.mall.ConfirmReceipt confirmReceipt = new com.meiji.biz.request.http.mall.ConfirmReceipt()
    @Test(description = "订单确认收货 confirmReceipt" ,groups = ["prod","uat"],testName = "confirmReceipt",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void confirmReceipt(TestContext testContext){
        confirmReceipt.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
