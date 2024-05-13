package com.credika.test.http.platform.goods

import com.credika.biz.request.http.platform.goods.ProdGetGoodsByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ProdGetGoodsByPageTest extends BaseTest {
    ProdGetGoodsByPage prodGetGoodsByPage = new ProdGetGoodsByPage()
    @Test(description = "获取商品列表 prodGetGoodsByPage" ,groups = ["prod","uat"],testName = "prodGetGoodsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void prodGetGoodsByPage(TestContext testContext){
        prodGetGoodsByPage.invoke(testContext).baseAssert(testContext)
    }
}
