package com.meiji.test.http.platform.live
import com.meiji.biz.request.http.platform.live.PageLive
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageLiveTest extends BaseTest {
    PageLive pageLive = new PageLive()
    @Test(description = "直播间查询 pageLive-所有" ,groups = ["prod","uat"],testName = "pageLive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLive(TestContext testContext){
        pageLive.invoke(testContext).baseAssert(testContext)
        pageLive.specialAssert(testContext)
    }

    @Test(description = "直播间查询 pageLive-直播中" ,groups = ["prod","uat"],testName = "pageLive1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLive1(TestContext testContext){
        pageLive.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "直播间查询 pageLive-未开始" ,groups = ["prod","uat"],testName = "pageLive2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLive2(TestContext testContext){
        pageLive.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "直播间查询 pageLive-已结束" ,groups = ["prod","uat"],testName = "pageLive3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLive3(TestContext testContext){
        pageLive.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "直播间查询 pageLive-禁播" ,groups = ["prod","uat"],testName = "pageLive4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLive4(TestContext testContext){
        pageLive.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "直播间查询 pageLive-暂停" ,groups = ["prod","uat"],testName = "pageLive5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLive5(TestContext testContext){
        pageLive.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "直播间查询 pageLive-异常" ,groups = ["prod","uat"],testName = "pageLive6",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLive6(TestContext testContext){
        pageLive.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "直播间查询 pageLive-已过期" ,groups = ["prod","uat"],testName = "pageLive7",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLive7(TestContext testContext){
        pageLive.invoke(testContext).baseAssert(testContext)
    }

}
