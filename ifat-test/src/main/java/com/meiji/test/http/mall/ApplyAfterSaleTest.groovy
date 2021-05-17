package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ApplyAfterSaleTest extends BaseTest {
    com.meiji.biz.request.http.mall.ApplyAfterSale applyAfterSale = new com.meiji.biz.request.http.mall.ApplyAfterSale()
    @Test(description = "C端申请售后 applyAfterSale" ,groups = ["prod","uat"],testName = "applyAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void applyAfterSale(TestContext testContext){
        applyAfterSale.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
