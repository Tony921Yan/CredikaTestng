package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.GetAfterLog
import com.meiji.request.http.shop.PageOrder
import org.testng.annotations.Test

class PageOrderTest extends BaseTest {
    PageOrder pageOrder = new PageOrderTest()
    @Test(description = "分页订单查询 pageOrder" ,groups = ["prod","uat"],testName = "pageOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrder(TestContext testContext){
        pageOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
