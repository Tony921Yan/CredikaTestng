package com.meiji.test.http.mall.activeRecord

import com.meiji.biz.request.http.mall.activeRecord.RaffleGetRaffleInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class RaffleGetRaffleInfoTest extends BaseTest {
    RaffleGetRaffleInfo raffleGetRaffleInfo = new RaffleGetRaffleInfo()
    @Test(description = "获取抽奖活动信息 raffleGetRaffleInfo" ,groups = ["prod","uat"],testName = "raffleGetRaffleInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void raffleGetRaffleInfo(TestContext testContext){
        raffleGetRaffleInfo.invoke(testContext).baseAssert(testContext)
    }
}