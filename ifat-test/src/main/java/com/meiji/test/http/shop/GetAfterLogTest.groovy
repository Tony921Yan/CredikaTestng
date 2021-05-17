package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.GetAfterLog
import org.testng.annotations.Test

class GetAfterLogTest extends BaseTest {
    GetAfterLog getAfterLog = new GetAfterLog()
    @Test(description = "获取协商历史 getAfterLog" ,groups = ["prod","uat"],testName = "getAfterLog",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAfterLog(TestContext testContext){
        getAfterLog.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
