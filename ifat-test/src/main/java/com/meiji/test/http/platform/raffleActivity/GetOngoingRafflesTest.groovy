package com.meiji.test.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.raffleActivity.GetOngoingRaffles
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOngoingRafflesTest extends BaseTest {
    GetOngoingRaffles getOngoingRaffles = new GetOngoingRaffles()
    @Test(description = "活动管理-抽奖活动-获取进行中的抽奖活动 getOngoingRaffles", groups = ["prod", "uat"], testName = "getOngoingRaffles",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void getOngoingRaffles(TestContext testContext) {
        getOngoingRaffles.invoke(testContext).baseAssert(testContext)
    }

}