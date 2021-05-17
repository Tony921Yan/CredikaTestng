package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.GetUserOrderCount
import org.testng.annotations.Test

class GetUserOrderCountTest extends BaseTest {
    GetUserOrderCount getUserOrderCount = new GetUserOrderCount()
    @Test(description = "获取用户订单状态计数 小红点 getUserOrderCount" ,groups = ["prod","uat"],testName = "getUserOrderCount",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getUserOrderCount(TestContext testContext){
        getUserOrderCount.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
