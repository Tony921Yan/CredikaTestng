package com.meiji.test.http.platform.goods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.goods.GetGoodsByPage
import org.testng.annotations.Test

class GetGoodsByPageTest extends BaseTest {
    GetGoodsByPage getGoodsByPage = new GetGoodsByPage()
    @Test(description = "获取商品列表 getGoodsByPage" ,groups = ["prod","uat"],testName = "prodGetGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByPage(TestContext testContext){
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
        getGoodsByPage.specialAssert(testContext)
    }

    @Test(description = "获取商品列表-categoryId为空" ,groups = ["prod","uat"],testName = "prodGetGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByPage_categoryIdNull(TestContext testContext){
        testContext.put("categoryId",null)
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }
    /**
     *
     @author Remy
     @create 2021/11/18-19:50
     @version v2.1
     */
    @Test(description = "频道管理-栏目-获取商品列表" ,groups = ["prod","uat"],testName = "prodGetGoodsByPage1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByPage1(TestContext testContext){
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品列表-待提交 getGoodsByPage0" ,groups = ["prod","uat"],testName = "GetGoodsByPage0",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetGoodsByPage0(TestContext testContext) {
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品列表-待审核 getGoodsByPage1" ,groups = ["prod","uat"],testName = "GetGoodsByPage1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetGoodsByPage1(TestContext testContext) {
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品列表-审核不通过 getGoodsByPage2" ,groups = ["prod","uat"],testName = "GetGoodsByPage2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetGoodsByPage2(TestContext testContext) {
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品列表-待发布 getGoodsByPage3" ,groups = ["prod","uat"],testName = "GetGoodsByPage3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetGoodsByPage3(TestContext testContext) {
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品列表-已发布 getGoodsByPage4" ,groups = ["prod","uat"],testName = "GetGoodsByPage4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetGoodsByPage4(TestContext testContext) {
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品列表-已删除 getGoodsByPage5" ,groups = ["prod","uat"],testName = "GetGoodsByPage5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetGoodsByPage5(TestContext testContext) {
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取组合商品列表-全部（缺少已删除的状态） getGoodsByPage6" ,groups = ["prod","uat"],testName = "GetGoodsByPage6",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetGoodsByPage6(TestContext testContext) {
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取组合商品列表-待提交 getGoodsByPage7" ,groups = ["prod","uat"],testName = "GetGoodsByPage7",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetGoodsByPage7(TestContext testContext) {
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取组合商品列表-待发布 getGoodsByPage8" ,groups = ["prod","uat"],testName = "GetGoodsByPage8",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetGoodsByPage8(TestContext testContext) {
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取组合商品列表-已发布 getGoodsByPage9" ,groups = ["prod","uat"],testName = "GetGoodsByPage9",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetGoodsByPage9(TestContext testContext) {
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取组合商品列表-已删除 getGoodsByPage10" ,groups = ["prod","uat"],testName = "GetGoodsByPage10",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetGoodsByPage10(TestContext testContext) {
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

}
