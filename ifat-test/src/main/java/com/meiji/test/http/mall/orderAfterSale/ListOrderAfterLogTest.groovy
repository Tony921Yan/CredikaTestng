package com.meiji.test.http.mall.orderAfterSale

import com.meiji.biz.request.http.mall.ListOrderAfterLog
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListOrderAfterLogTest extends BaseTest {
    ListOrderAfterLog listOrderAfterLog = new ListOrderAfterLog()
    @Test(description = "查看售后协商历史 listOrderAfterLog" ,groups = ["prod","uat"],testName = "listOrderAfterLog",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listOrderAfterLog(TestContext testContext){
        listOrderAfterLog.invoke(testContext).baseAssert(testContext)
    }
}
