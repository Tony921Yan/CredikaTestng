package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.UpdateApplyAfterSale
import org.testng.annotations.Test

class UpdateApplyAfterSaleTest extends BaseTest {
    UpdateApplyAfterSale updateApplyAfterSale = new UpdateApplyAfterSale()
    @Test(description = "C端修改售后 updateApplyAfterSale" ,groups = ["prod","uat"],testName = "updateApplyAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateApplyAfterSale(TestContext testContext){
        updateApplyAfterSale.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
