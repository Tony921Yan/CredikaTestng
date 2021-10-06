package com.meiji.test.http.platform.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.brand.QueryBrandsByPage
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class QueryBrandsByPageTest extends BaseTest {
    QueryBrandsByPage queryBrandsByPage = new QueryBrandsByPage()
    @Test(description = "品牌分页查询 queryBrands" ,groups = ["prod","uat"],testName = "queryBrandsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryBrandsByPage(TestContext testContext){
        queryBrandsByPage.invoke(testContext).baseAssert(testContext)
        queryBrandsByPage.specialAssert(testContext)
    }
}
