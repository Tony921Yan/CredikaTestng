package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.PageOrder
import org.testng.annotations.Test

class PageOrderTest extends BaseTest {
    PageOrder pageOrder = new PageOrder()
    @Test(description = "分页订单查询 pageOrder" ,groups = ["prod","uat"],testName = "pageOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrder(TestContext testContext){
        pageOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
