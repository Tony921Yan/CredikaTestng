package com.credika.test.http.mall.activeRecord

import com.credika.biz.request.http.mall.activeRecord.GetIntegraCenterRafflePage
import com.credika.biz.request.http.mall.activeRecord.GetRaffleSubsuribe
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetRaffleSubsuribeTest extends BaseTest {
    GetRaffleSubsuribe getRaffleSubsuribe = new GetRaffleSubsuribe()
    GetIntegraCenterRafflePage getIntegraCenterRafflePage = new GetIntegraCenterRafflePage()
    @Test(description = "积分抽奖订阅情况 getRaffleSubsuribe" ,groups = ["prod","uat"],testName = "getRaffleSubsuribe",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getRaffleSubsuribe(TestContext testContext){
        getIntegraCenterRafflePage.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        getRaffleSubsuribe.invoke(testContext).baseAssert(testContext)
    }
}