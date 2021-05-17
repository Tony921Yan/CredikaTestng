package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.GetAfterOrderDetail
import com.meiji.request.http.shop.GetAfterOrderPage
import org.testng.annotations.Test

class GetAfterOrderPageTest extends BaseTest {
    GetAfterOrderPage getAfterOrderPage = new GetAfterOrderPage()
    @Test(description = "获取售后单列表 getAfterOrderPage" ,groups = ["prod","uat"],testName = "getAfterOrderPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAfterOrderPage(TestContext testContext){
        getAfterOrderPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
