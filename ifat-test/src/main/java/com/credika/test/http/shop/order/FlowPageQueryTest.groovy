package com.credika.test.http.shop.order

import com.credika.biz.request.http.shop.order.FlowPageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FlowPageQueryTest extends BaseTest {
    FlowPageQuery flowPageQuery = new FlowPageQuery()
    @Test(description = "获取月度流水记录 flowPageQuery" ,groups = ["prod","uat"],testName = "flowPageQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void flowPageQuery(TestContext testContext){
        flowPageQuery.invoke(testContext).baseAssert(testContext)
    }
}
