package com.meiji.test.http.platform.accountmanager


import com.meiji.biz.request.http.platform.accountmanager.OrderRecordPageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class OrderRecordPageQueryTest extends BaseTest {
    OrderRecordPageQuery orderRecordPageQuery = new OrderRecordPageQuery()
    @Test(description = "订单记录分页查询 orderRecordPageQuery" ,groups = ["prod","uat"],testName = "orderRecordPageQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void orderRecordPageQuery(TestContext testContext){
        orderRecordPageQuery.invoke(testContext).baseAssert(testContext)
    }
}
