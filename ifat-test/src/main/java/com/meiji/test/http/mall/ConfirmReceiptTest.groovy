package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.CancelOrder
import com.meiji.request.http.mall.ConfirmReceipt
import org.testng.annotations.Test

class ConfirmReceiptTest extends BaseTest {
    ConfirmReceipt confirmReceipt = new ConfirmReceipt()
    @Test(description = "订单确认收货 confirmReceipt" ,groups = ["prod","uat"],testName = "confirmReceipt",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void confirmReceipt(TestContext testContext){
        confirmReceipt.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
