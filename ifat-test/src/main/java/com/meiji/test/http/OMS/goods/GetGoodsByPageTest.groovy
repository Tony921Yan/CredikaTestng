package com.meiji.test.http.OMS.goods
import com.meiji.biz.request.http.OMS.goods.GetGoodsByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsByPageTest extends BaseTest {
    GetGoodsByPage GetGoodsByPage = new GetGoodsByPage()
    @Test(description = "获取商品信息-全部 GetGoodsByPage" ,groups = ["prod","uat"],testName = "OMSGetGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class) //不包括状态为5已删除的商品
    void GetGoodsByPage(TestContext testContext){
        GetGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品信息-待提交 GetGoodsByPage" ,groups = ["prod","uat"],testName = "OMSGetGoodsByPage0",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void GetGoodsByPage0(TestContext testContext){
        GetGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品信息-待审核 GetGoodsByPage" ,groups = ["prod","uat"],testName = "OMSGetGoodsByPage1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void GetGoodsByPage1(TestContext testContext){
        GetGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品信息-审核不通 GetGoodsByPage" ,groups = ["prod","uat"],testName = "OMSGetGoodsByPage2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void GetGoodsByPage2(TestContext testContext){
        GetGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品信息-待发布 GetGoodsByPage" ,groups = ["prod","uat"],testName = "OMSGetGoodsByPage3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void GetGoodsByPage3(TestContext testContext){
        GetGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品信息-已发布 GetGoodsByPage" ,groups = ["prod","uat"],testName = "OMSGetGoodsByPage4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void GetGoodsByPage4(TestContext testContext){
        GetGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品信息-已删除 GetGoodsByPage" ,groups = ["prod","uat"],testName = "OMSGetGoodsByPage5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void GetGoodsByPage5(TestContext testContext){
        GetGoodsByPage.invoke(testContext).baseAssert(testContext)
    }
}

