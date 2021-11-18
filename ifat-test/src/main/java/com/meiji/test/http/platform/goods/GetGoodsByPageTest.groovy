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
}
