package com.meiji.test.http.platform.orderDetailManage

import com.meiji.biz.request.http.platform.orderDetailManage.ApplyAfterSale
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ApplyAfterSaleTest extends BaseTest {
    ApplyAfterSale applyAfterSale = new ApplyAfterSale()
    @Test(description = "创建售后单-异常场景：线上O2022032421520143300 applyAfterSale" ,groups = ["prod","uat"],testName = "applyAfterSale-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void applyAfterSale(TestContext testContext){
        applyAfterSale.invoke(testContext).baseAssert(testContext)
    }
}
