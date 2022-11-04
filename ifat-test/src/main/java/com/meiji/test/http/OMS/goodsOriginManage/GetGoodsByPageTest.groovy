package com.meiji.test.http.OMS.goodsOriginManage
import com.meiji.biz.request.http.OMS.goodsOriginManage.GetGoodsByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsByPageTest extends BaseTest {
    GetGoodsByPage getGoodsByPage = new GetGoodsByPage()
    @Test(description = "搜索溯源 状态-全部 getGoodsByPage" ,groups = ["prod","uat"],testName = "getGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getGoodsByPage(TestContext testContext){
        getGoodsByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "搜索溯源 状态-待提交 getGoodsByPage01" ,groups = ["prod","uat"],testName = "getGoodsByPage01",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getGoodsByPage01(TestContext testContext){
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索溯源 状态-待审核 getGoodsByPage02" ,groups = ["prod","uat"],testName = "getGoodsByPage02",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getGoodsByPage02(TestContext testContext){
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索溯源 状态-审核通过 getGoodsByPage03" ,groups = ["prod","uat"],testName = "getGoodsByPage03",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getGoodsByPage03(TestContext testContext){
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索溯源 状态-审核不通过 getGoodsByPage04" ,groups = ["prod","uat"],testName = "getGoodsByPage04",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getGoodsByPage04(TestContext testContext){
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索溯源 状态-已删除 getGoodsByPage05" ,groups = ["prod","uat"],testName = "getGoodsByPage05",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getGoodsByPage05(TestContext testContext){
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }
}

