package com.meiji.test.http.shop.profitSharing

import com.meiji.biz.request.http.shop.profitSharing.ProfitSharingList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ProfitSharingListTest extends BaseTest {
    ProfitSharingList profitSharingList = new ProfitSharingList()
    @Test(description = "分账流水 profitSharingList" ,groups = ["prod","uat"],testName = "profitSharingList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void profitSharingList(TestContext testContext){
        profitSharingList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

}
