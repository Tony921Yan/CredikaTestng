package com.meiji.test.http.goods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.goods.GetGoodsByPage
import org.testng.annotations.Test

class GetGoodsByPageTest extends BaseTest {
    GetGoodsByPage getGoodsByPage = new GetGoodsByPage()
    @Test(description = "获取商品列表 getGoodsByPage" ,groups = ["prod","uat"],testName = "getGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByPage(TestContext testContext){
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取商品列表-categoryId为空" ,groups = ["prod","uat"],testName = "getGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByPage_categoryIdNull(TestContext testContext){
        testContext.put("categoryId",null)
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }
}
