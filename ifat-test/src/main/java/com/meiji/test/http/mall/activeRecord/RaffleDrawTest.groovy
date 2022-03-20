package com.meiji.test.http.mall.activeRecord

import com.meiji.biz.request.http.mall.activeRecord.RaffleDraw
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/03/19 23:18
 * @Vession V2.6.3
 * */
class RaffleDrawTest extends BaseTest {
    RaffleDraw raffleDraw = new RaffleDraw()
    @Test(description = "抽奖 raffleDraw" ,groups = ["prod","uat"],testName = "raffleDraw",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void raffleDraw(TestContext testContext){
        raffleDraw.invoke(testContext).baseAssert(testContext)
    }
}