package com.meiji.test.http.mall.orderAfterSale

import com.meiji.biz.request.http.mall.UpdateApplyAfterSale
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateApplyAfterSaleTest extends BaseTest {
    UpdateApplyAfterSale updateApplyAfterSale = new UpdateApplyAfterSale()
    @Test(description = "C端修改售后 updateApplyAfterSale" ,groups = ["prod","uat"],testName = "updateApplyAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateApplyAfterSale(TestContext testContext){
        updateApplyAfterSale.invoke(testContext).baseAssert(testContext)
    }
}
