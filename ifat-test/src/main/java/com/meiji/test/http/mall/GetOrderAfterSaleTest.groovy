package com.meiji.test.http.mall

import com.meiji.biz.request.http.mall.GetOrderAfterSale
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderAfterSaleTest extends BaseTest {
    GetOrderAfterSale getOrderAfterSale = new GetOrderAfterSale()
    @Test(description = "查看售后详情 getOrderAfterSale" ,groups = ["prod","uat"],testName = "getOrderAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterSale(TestContext testContext){
        getOrderAfterSale.invoke(testContext).baseAssert(testContext)
    }
}
