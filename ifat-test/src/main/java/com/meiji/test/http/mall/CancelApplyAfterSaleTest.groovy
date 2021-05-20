package com.meiji.test.http.mall

import com.meiji.biz.request.http.mall.CancelApplyAfterSale
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CancelApplyAfterSaleTest extends BaseTest {
    CancelApplyAfterSale cancelApplyAfterSale = new CancelApplyAfterSale()
    @Test(description = "C端取消售后 cancelApplyAfterSale" ,groups = ["prod","uat"],testName = "cancelApplyAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cancelApplyAfterSale(TestContext testContext){
        cancelApplyAfterSale.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
