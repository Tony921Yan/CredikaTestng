package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.ConfirmReceipt
import com.meiji.request.http.mall.GetOrderAfterSale
import org.testng.annotations.Test

class GetOrderAfterSaleTest extends BaseTest {
    GetOrderAfterSale getOrderAfterSale = new GetOrderAfterSale()
    @Test(description = "查看售后详情 getOrderAfterSale" ,groups = ["prod","uat"],testName = "getOrderAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterSale(TestContext testContext){
        getOrderAfterSale.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
