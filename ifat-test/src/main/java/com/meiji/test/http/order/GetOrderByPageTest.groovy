package com.meiji.test.http.order

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.order.GetOrderByPage
import com.meiji.util.JsonUtil
import org.testng.annotations.Test

class GetOrderByPageTest extends BaseTest {
    GetOrderByPage getOrderByPage = new GetOrderByPage()
    @Test(description = "获取订单数据 getOrderByPage" ,groups = ["prod","uat"],testName = "getOrderByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage(TestContext testContext){
        testContext.put("condition", JsonUtil.objToJsonList(testContext.get("condition")))
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }
}
