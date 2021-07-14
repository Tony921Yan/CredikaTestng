package com.meiji.test.http.mall.orderAfterSale

import com.meiji.biz.request.http.mall.orderAfterSale.PageOrderAfterSale
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageOrderAfterSaleTest extends BaseTest {
    PageOrderAfterSale pageOrderAfterSale = new PageOrderAfterSale()
    @Test(description = "查询售后列表 pageOrderAfterSale" ,groups = ["prod","uat"],testName = "pageOrderAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrderAfterSale(TestContext testContext){
        pageOrderAfterSale.invoke(testContext).baseAssert(testContext)
    }
}
