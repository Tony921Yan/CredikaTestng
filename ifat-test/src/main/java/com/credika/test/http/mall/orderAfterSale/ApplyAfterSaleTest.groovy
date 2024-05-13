package com.credika.test.http.mall.orderAfterSale

import com.credika.biz.request.http.mall.orderAfterSale.ApplyAfterSale
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ApplyAfterSaleTest extends BaseTest {
    ApplyAfterSale applyAfterSale = new ApplyAfterSale()
    @Test(description = "C端申请售后 applyAfterSale" ,groups = ["prod","uat"],testName = "applyAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void applyAfterSale(TestContext testContext){
        applyAfterSale.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
