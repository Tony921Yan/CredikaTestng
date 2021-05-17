package com.meiji.test.http.orderafter

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.orderafter.GetOrderAfterByPage
import com.meiji.request.http.orderafter.GetOrderAfterDetail
import org.testng.annotations.Test

class GetOrderAfterByPageTest extends BaseTest {
    GetOrderAfterByPage getOrderAfterByPage = new GetOrderAfterByPage()
    @Test(description = "获取售后单分页 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
