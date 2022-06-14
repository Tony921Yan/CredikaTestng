package com.meiji.test.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.activeMainManage.SaveSourceRaffle
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SaveSourceRaffleTest extends BaseTest {
    SaveSourceRaffle saveSourceRaffle = new SaveSourceRaffle()
    @Test(description = "活动管理-抽奖活动-活动配置保存 saveSourceRaffle" ,groups = ["prod","uat"],testName = "saveSourceRaffle",
            dataProvider = "dataProvider",dataProviderClass = TestData.class) //鉴于修改保存配置会影响测试，暂时不传参
    public void saveSourceRaffle(TestContext testContext){
        saveSourceRaffle.invoke(testContext).baseAssert(testContext)
    }

}