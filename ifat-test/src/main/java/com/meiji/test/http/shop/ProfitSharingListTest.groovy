package com.meiji.test.http.shop


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ProfitSharingListTest extends BaseTest {
    com.meiji.biz.request.http.shop.ProfitSharingList profitSharingList = new com.meiji.biz.request.http.shop.ProfitSharingList()
    @Test(description = "分账流水 profitSharingList" ,groups = ["prod","uat"],testName = "profitSharingList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void profitSharingList(TestContext testContext){
        profitSharingList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

}
