package com.credika.test.http.platform.raffleActivity
import com.credika.biz.request.http.platform.raffleActivity.GetSourceRaffle
import com.credika.biz.request.http.platform.raffleActivity.SaveSourceRaffle
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SaveSourceRaffleTest extends BaseTest {
    SaveSourceRaffle saveSourceRaffle = new SaveSourceRaffle()
    GetSourceRaffle getSourceRaffle = new GetSourceRaffle()
    @Test(description = "抽奖活动-活动配置保存 saveSourceRaffle", groups = ["prod", "uat"], testName = "saveSourceRaffle",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void saveSourceRaffle(TestContext testContext) {
        //testContext.put("paymentPageRaffleId", MysqlService.getSaveSourceRaffleID().getAt(0))
//        testContext.put("separatePageRaffleId", MysqlService.getSaveSourceRaffleID().getAt(1))
        getSourceRaffle.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        saveSourceRaffle.invoke(testContext).baseAssert(testContext)
    }

}