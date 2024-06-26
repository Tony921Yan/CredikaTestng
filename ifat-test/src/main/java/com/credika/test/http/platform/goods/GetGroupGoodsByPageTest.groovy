package com.credika.test.http.platform.goods

import com.credika.biz.request.http.platform.goods.GetGroupGoodsByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGroupGoodsByPageTest extends BaseTest {
    GetGroupGoodsByPage getGroupGoodsByPage = new GetGroupGoodsByPage()
    @Test(description = "获取组合商品列表 getGroupGoodsByPage" ,groups = ["prod","uat"],testName = "getGroupGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByPage(TestContext testContext){
        getGroupGoodsByPage.invoke(testContext).baseAssert(testContext)
        getGroupGoodsByPage.specialAssert(testContext)
    }

    @Test(description = "获取组合商品列表-categoryId为空" ,groups = ["prod","uat"],testName = "getGroupGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByPage_categoryIdNull(TestContext testContext){
        testContext.put("categoryId",null)
        getGroupGoodsByPage.invoke(testContext).baseAssert(testContext)
    }
}
