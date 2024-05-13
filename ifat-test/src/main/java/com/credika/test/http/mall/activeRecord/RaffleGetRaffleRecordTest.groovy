package com.credika.test.http.mall.activeRecord

import com.credika.biz.request.http.mall.activeRecord.RaffleGetRaffleRecord
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/03/19 23:18
 * @Vession V2.6.3
 * */
class RaffleGetRaffleRecordTest extends BaseTest {
    RaffleGetRaffleRecord raffleGetRaffleRecord = new RaffleGetRaffleRecord()
    @Test(description = "个人中心-中奖记录 raffleGetRaffleRecord" ,groups = ["prod","uat"],testName = "raffleGetRaffleRecord",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void raffleGetRaffleRecord(TestContext testContext){
        raffleGetRaffleRecord.invoke(testContext).baseAssert(testContext)
    }
}