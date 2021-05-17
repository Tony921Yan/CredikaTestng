package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageOrderAfterSaleTest extends BaseTest {
    com.meiji.biz.request.http.mall.PageOrderAfterSale pageOrderAfterSale = new com.meiji.biz.request.http.mall.PageOrderAfterSale()
    @Test(description = "查询售后列表 pageOrderAfterSale" ,groups = ["prod","uat"],testName = "pageOrderAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrderAfterSale(TestContext testContext){
        pageOrderAfterSale.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
