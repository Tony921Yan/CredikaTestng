package com.meiji.test.api.goods


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsByPageTest extends BaseTest {
    com.meiji.biz.request.api.goods.GetGoodsByPage getGoodsByPage = new com.meiji.biz.request.api.goods.GetGoodsByPage()
    @Test(description = "获取商品列表 getGoodsByPage" ,groups = ["prod","uat"],testName = "getGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByPage(TestContext testContext){
        getGoodsByPage.invoke(testContext).baseAssert(testContext)
    }
}
