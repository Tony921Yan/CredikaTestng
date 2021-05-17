package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.ConfirmReceipt
import com.meiji.request.http.mall.PageOrderAfterSale
import org.testng.annotations.Test

class PageOrderAfterSaleTest extends BaseTest {
    PageOrderAfterSale pageOrderAfterSale = new PageOrderAfterSale()
    @Test(description = "查询售后列表 pageOrderAfterSale" ,groups = ["prod","uat"],testName = "pageOrderAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrderAfterSale(TestContext testContext){
        pageOrderAfterSale.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
