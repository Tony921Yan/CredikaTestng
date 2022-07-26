package com.meiji.test.http.OMS.order
import com.meiji.biz.request.http.OMS.order.GetOrderCount
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderCountTest extends BaseTest {
    GetOrderCount getOrderCount = new GetOrderCount()
    @Test(description = "订单红点计数 getOrderCount" ,groups = ["prod","uat"],testName = "getOrderCount",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderCount(TestContext testContext){
        getOrderCount.invoke(testContext).baseAssert(testContext)
    }
}
