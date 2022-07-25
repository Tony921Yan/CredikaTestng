package com.meiji.test.http.OMS.goods
import com.meiji.biz.request.http.OMS.goods.QueryPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryPageTest extends BaseTest {
    QueryPage queryPage = new QueryPage()
    @Test(description = "获取商品详情 queryPage" ,groups = ["prod","uat"],testName = "queryPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void queryPage(TestContext testContext){
        queryPage.invoke(testContext).baseAssert(testContext)
    }
}

