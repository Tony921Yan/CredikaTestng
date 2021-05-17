package com.meiji.test.http.orderafter

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.orderafter.GetOrderAfterByPage
import org.testng.annotations.Test

class GetOrderAfterByPageTest extends BaseTest {
    GetOrderAfterByPage getOrderAfterByPage = new GetOrderAfterByPage()
    @Test(description = "获取售后单分页 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
