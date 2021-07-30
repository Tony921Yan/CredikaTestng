package com.meiji.test.http.shop.order

import com.meiji.biz.request.http.shop.order.GetAfterLog
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetAfterLogTest extends BaseTest {
    GetAfterLog getAfterLog = new GetAfterLog()
    @Test(description = "获取协商历史 getAfterLog" ,groups = ["prod","uat"],testName = "getAfterLog",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAfterLog(TestContext testContext){
        getAfterLog.invoke(testContext).baseAssert(testContext)
    }
}
