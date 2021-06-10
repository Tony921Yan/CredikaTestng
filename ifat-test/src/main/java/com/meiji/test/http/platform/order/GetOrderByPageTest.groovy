package com.meiji.test.http.platform.order

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.order.GetOrderByPage
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class GetOrderByPageTest extends BaseTest {
    GetOrderByPage getOrderByPage = new GetOrderByPage()
    @Test(description = "获取订单数据 getOrderByPage" ,groups = ["prod","uat"],testName = "getOrderByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage(TestContext testContext){
//        getOrderByPage.testContext.put("condition", JsonUtil.objToJsonList(testContext.get("condition")))
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }
}
