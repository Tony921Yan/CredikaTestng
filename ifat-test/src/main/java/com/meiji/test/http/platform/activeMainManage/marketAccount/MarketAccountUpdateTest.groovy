package com.meiji.test.http.platform.activeMainManage.marketAccount

import com.meiji.biz.request.http.platform.activeMainManage.marketAccount.MarketAccountAdd
import com.meiji.biz.request.http.platform.activeMainManage.marketAccount.MarketAccountUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MarketAccountUpdateTest extends BaseTest {
    MarketAccountAdd marketAccountAdd  = new MarketAccountAdd()
    MarketAccountUpdate marketAccountUpdate = new MarketAccountUpdate()
    @Test(description = "营销账户更新接口 marketAccountUpdate" ,groups = ["uat"],testName = "marketAccountUpdate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void marketAccountUpdate(TestContext testContext){
        marketAccountUpdate.invoke(testContext).baseAssert(testContext)
    }

}