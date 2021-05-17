package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.AddUserAddress
import com.meiji.request.http.mall.ApplyAfterSale
import org.testng.annotations.Test

class ApplyAfterSaleTest extends BaseTest {
    ApplyAfterSale applyAfterSale = new ApplyAfterSale()
    @Test(description = "C端申请售后 applyAfterSale" ,groups = ["prod","uat"],testName = "applyAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void applyAfterSale(TestContext testContext){
        applyAfterSale.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
