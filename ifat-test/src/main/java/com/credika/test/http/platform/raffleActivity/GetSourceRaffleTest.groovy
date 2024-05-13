package com.credika.test.http.platform.raffleActivity
import com.credika.biz.request.http.platform.raffleActivity.GetSourceRaffle
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSourceRaffleTest extends BaseTest {
    GetSourceRaffle getSourceRaffle = new GetSourceRaffle()
    @Test(description = "抽奖活动-活动配置 getSourceRaffle", groups = ["prod", "uat"], testName = "getSourceRaffle",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void saveSourceRaffle(TestContext testContext) {
        getSourceRaffle.invoke(testContext).baseAssert(testContext)
    }

}