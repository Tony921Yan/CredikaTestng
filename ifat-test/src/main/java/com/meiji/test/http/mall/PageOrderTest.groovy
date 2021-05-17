package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageOrderTest extends BaseTest {
    com.meiji.biz.request.http.mall.PageOrder pageOrder = new com.meiji.biz.request.http.mall.PageOrder()
    @Test(description = "分页订单查询 pageOrder" ,groups = ["prod","uat"],testName = "pageOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrder(TestContext testContext){
        pageOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
