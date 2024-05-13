package com.credika.test.http.mall.activeRecord

import com.credika.biz.request.http.mall.activeRecord.RaffleGetRaffleMoney
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/03/23 23:18
 * @Vession V2.6.3
 * */
class RaffleGetRaffleMoneyTest extends BaseTest {
    RaffleGetRaffleMoney raffleGetRaffleMoney = new RaffleGetRaffleMoney()
    @Test(description = "抽奖-已领取返现 raffleGetRaffleMoney" ,groups = ["prod","uat"],testName = "raffleGetRaffleMoney",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void raffleGetRaffleMoney(TestContext testContext){
        raffleGetRaffleMoney.invoke(testContext).baseAssert(testContext)
    }
}