package com.meiji.test.http.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.brand.QueryBrands
import org.testng.annotations.Test

class QueryBrandsTest extends BaseTest {
    QueryBrands queryBrands = new QueryBrands()
    @Test(description = "品牌分页查询 queryBrands" ,groups = ["prod","uat"],testName = "queryBrands",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryBrands(TestContext testContext){
        queryBrands.invoke(testContext).baseAssert(testContext)
    }
}
