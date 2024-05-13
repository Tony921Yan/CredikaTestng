package com.credika.test.http.mall.live

import com.credika.biz.request.http.mall.live.GetLiveSetting
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/01/27 18:18
 * @Vession V2.5
 */
class GetLiveSettingTest extends BaseTest{
    GetLiveSetting getLiveSetting = new GetLiveSetting()
    @Test(description = "获取直播设置 getLiveSetting",groups = ["uat","prod"],testName = "getLiveSetting",
            dataProvider = "dataProvider",dataProviderClass = TestData.class) //getLiveSetting无参
    public void getLiveSetting(TestContext testContext){
        getLiveSetting.invoke(testContext).baseAssert(testContext)
    }
}
