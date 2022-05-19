package com.meiji.test.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.raffleActivity.SaveSourceRaffle
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SaveSourceRaffleTest extends BaseTest {
    SaveSourceRaffle saveSourceRaffle = new SaveSourceRaffle()
    @Test(description = "抽奖活动-活动配置保存 saveSourceRaffle", groups = ["prod", "uat"], testName = "saveSourceRaffle",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void saveSourceRaffle(TestContext testContext) {
        testContext.put("paymentPageRaffleId", MysqlService.getSaveSourceRaffleID().getAt(0))
        testContext.put("separatePageRaffleId", MysqlService.getSaveSourceRaffleID().getAt(1))
        saveSourceRaffle.invoke(testContext).baseAssert(testContext)
    }

}