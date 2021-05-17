package com.meiji.test.http.shop


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetAfterOrderPageTest extends BaseTest {
    com.meiji.biz.request.http.shop.GetAfterOrderPage getAfterOrderPage = new com.meiji.biz.request.http.shop.GetAfterOrderPage()
    @Test(description = "获取售后单列表 getAfterOrderPage" ,groups = ["prod","uat"],testName = "getAfterOrderPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAfterOrderPage(TestContext testContext){
        getAfterOrderPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
