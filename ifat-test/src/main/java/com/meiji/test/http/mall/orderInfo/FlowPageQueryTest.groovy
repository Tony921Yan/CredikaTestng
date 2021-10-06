package com.meiji.test.http.mall.orderInfo

import com.meiji.biz.request.http.shop.order.FlowPageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FlowPageQueryTest extends BaseTest {
    FlowPageQuery flowPageQuery = new FlowPageQuery()
    @Test(description = "获取月度流水记录 flowPageQuery" ,groups = ["prod","uat"],testName = "flowPageQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void flowPageQuery(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",10)
        testContext.put("condition",'{"shopId":1405981112139808,"tradeType":4,"month":7,"year":2021}')
        flowPageQuery.invoke(testContext).baseAssert(testContext)
    }
}
