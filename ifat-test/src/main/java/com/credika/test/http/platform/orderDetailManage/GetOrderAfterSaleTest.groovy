package com.credika.test.http.platform.orderDetailManage

import com.credika.biz.request.http.platform.orderDetailManage.GetOrderAfterSale
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderAfterSaleTest extends BaseTest {
    GetOrderAfterSale getOrderAfterSale = new GetOrderAfterSale()
    @Test(description = "获取售后单 getOrderAfterSale" ,groups = ["prod","uat"],testName = "getOrderAfterSale-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterSale(TestContext testContext){
        getOrderAfterSale.invoke(testContext).baseAssert(testContext)
    }
}
