package com.credika.test.http.shop.order

import com.credika.biz.request.http.shop.order.GetAfterOrderPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetAfterOrderPageTest extends BaseTest {
    GetAfterOrderPage getAfterOrderPage = new GetAfterOrderPage()
    @Test(description = "获取售后单列表 getAfterOrderPage" ,groups = ["prod","uat"],testName = "getAfterOrderPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAfterOrderPage(TestContext testContext){
        getAfterOrderPage.invoke(testContext).baseAssert(testContext)
    }
}
