package com.meiji.test.http.platform.accountmanager


import com.meiji.biz.request.http.platform.accountmanager.OrderDetailQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class OrderDetailQueryTest extends BaseTest {
    OrderDetailQuery orderDetailQuery = new OrderDetailQuery()
    @Test(description = "订单明细查询 orderDetailQuery" ,groups = ["prod","uat"],testName = "orderDetailQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void orderDetailQuery(TestContext testContext){
        orderDetailQuery.invoke(testContext).baseAssert(testContext)
    }
}
