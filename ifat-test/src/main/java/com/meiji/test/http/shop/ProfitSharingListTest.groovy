package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.Asset
import com.meiji.request.http.shop.ProfitSharingList
import org.testng.annotations.Test

class ProfitSharingListTest extends BaseTest {
    ProfitSharingList profitSharingList = new ProfitSharingList()
    @Test(description = "分账流水 profitSharingList" ,groups = ["prod","uat"],testName = "profitSharingList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void profitSharingList(TestContext testContext){
        profitSharingList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

}
