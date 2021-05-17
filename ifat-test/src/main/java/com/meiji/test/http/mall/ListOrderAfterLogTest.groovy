package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListOrderAfterLogTest extends BaseTest {
    com.meiji.biz.request.http.mall.ListOrderAfterLog listOrderAfterLog = new com.meiji.biz.request.http.mall.ListOrderAfterLog()
    @Test(description = "查看售后协商历史 listOrderAfterLog" ,groups = ["prod","uat"],testName = "listOrderAfterLog",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listOrderAfterLog(TestContext testContext){
        listOrderAfterLog.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
