package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetUserOrderCountTest extends BaseTest {
    com.meiji.biz.request.http.mall.GetUserOrderCount getUserOrderCount = new com.meiji.biz.request.http.mall.GetUserOrderCount()
    @Test(description = "获取用户订单状态计数 小红点 getUserOrderCount" ,groups = ["prod","uat"],testName = "getUserOrderCount",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getUserOrderCount(TestContext testContext){
        getUserOrderCount.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
