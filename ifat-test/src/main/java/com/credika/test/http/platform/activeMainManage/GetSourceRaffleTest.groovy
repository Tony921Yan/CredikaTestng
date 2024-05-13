package com.credika.test.http.platform.activeMainManage

import com.credika.biz.request.http.platform.activeMainManage.GetSourceRaffle
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSourceRaffleTest extends BaseTest {
    GetSourceRaffle getSourceRaffle = new GetSourceRaffle()
    @Test(description = "活动管理-抽奖活动-活动配置 getSourceRaffle" ,groups = ["prod","uat"],testName = "getSourceRaffle",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSourceRaffle(TestContext testContext){
        getSourceRaffle.invoke(testContext).baseAssert(testContext)
    }

}