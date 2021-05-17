package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateApplyAfterSaleTest extends BaseTest {
    com.meiji.biz.request.http.mall.UpdateApplyAfterSale updateApplyAfterSale = new com.meiji.biz.request.http.mall.UpdateApplyAfterSale()
    @Test(description = "C端修改售后 updateApplyAfterSale" ,groups = ["prod","uat"],testName = "updateApplyAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateApplyAfterSale(TestContext testContext){
        updateApplyAfterSale.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
