package com.meiji.test.api.goods

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.goods.GetGoodsByPage
import org.testng.annotations.Test

class GetGoodsByPageTest extends BaseTest {
    GetGoodsByPage getGoodsByPage = new GetGoodsByPage()
    @Test(description = "获取商品列表" ,groups = ["prod","uat"],testName = "getGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByPage(TestContext testContext){
        getGoodsByPage.invoke(testContext)
    }
}
