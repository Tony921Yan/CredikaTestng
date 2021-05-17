package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.AddUserAddress
import com.meiji.request.http.mall.CancelApplyAfterSale
import org.testng.annotations.Test

class CancelApplyAfterSaleTest extends BaseTest {
    CancelApplyAfterSale cancelApplyAfterSale = new CancelApplyAfterSale()
    @Test(description = "C端取消售后 cancelApplyAfterSale" ,groups = ["prod","uat"],testName = "cancelApplyAfterSale",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cancelApplyAfterSale(TestContext testContext){
        cancelApplyAfterSale.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
