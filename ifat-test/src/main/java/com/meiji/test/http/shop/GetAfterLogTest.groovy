package com.meiji.test.http.shop


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetAfterLogTest extends BaseTest {
    com.meiji.biz.request.http.shop.GetAfterLog getAfterLog = new com.meiji.biz.request.http.shop.GetAfterLog()
    @Test(description = "获取协商历史 getAfterLog" ,groups = ["prod","uat"],testName = "getAfterLog",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAfterLog(TestContext testContext){
        getAfterLog.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
