package com.meiji.test.http.mall.orderInfo

import com.meiji.biz.request.http.mall.orderInfo.ConfirmReceipt
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ConfirmReceiptTest extends BaseTest {
    ConfirmReceipt confirmReceipt = new ConfirmReceipt()
    @Test(description = "订单确认收货 confirmReceipt" ,groups = ["prod","uat"],testName = "confirmReceipt",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void confirmReceipt(TestContext testContext){
        confirmReceipt.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
