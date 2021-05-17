package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.ConfirmReceipt
import com.meiji.request.http.mall.ListOrderAfterLog
import org.testng.annotations.Test

class ListOrderAfterLogTest extends BaseTest {
    ListOrderAfterLog listOrderAfterLog = new ListOrderAfterLog()
    @Test(description = "查看售后协商历史 listOrderAfterLog" ,groups = ["prod","uat"],testName = "listOrderAfterLog",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listOrderAfterLog(TestContext testContext){
        listOrderAfterLog.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
