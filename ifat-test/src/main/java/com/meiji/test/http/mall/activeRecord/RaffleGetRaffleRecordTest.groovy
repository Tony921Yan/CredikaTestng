package com.meiji.test.http.mall.activeRecord

import com.meiji.biz.request.http.mall.activeRecord.RaffleGetRaffleRecord
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class RaffleGetRaffleRecordTest extends BaseTest {
    RaffleGetRaffleRecord raffleGetRaffleRecord = new RaffleGetRaffleRecord()
    @Test(description = "个人中心-中奖记录 raffleGetRaffleRecord" ,groups = ["prod","uat"],testName = "raffleGetRaffleRecord",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void raffleGetRaffleRecord(TestContext testContext){
        raffleGetRaffleRecord.invoke(testContext).baseAssert(testContext)
    }
}