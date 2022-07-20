package com.meiji.test.http.mall.active

import com.meiji.biz.request.http.mall.active.GetCurrentTime
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/04/21 10:18
 * @Vession V2.7.1
 * */
class GetCurrentTimeTest extends BaseTest {
    GetCurrentTime getCurrentTime = new GetCurrentTime()
    @Test(description = "获取当前时间 getCurrentTime" ,groups = ["prod","uat"],testName = "getCurrentTime",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCurrentTime(TestContext testContext){
        getCurrentTime.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}