package com.meiji.test.api.brand


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryBrandsTest extends BaseTest {
    com.meiji.biz.request.api.brand.QueryBrands queryBrands = new com.meiji.biz.request.api.brand.QueryBrands()
    @Test(description = "品牌分页查询 queryBrands" ,groups = ["prod","uat"],testName = "queryBrands",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryBrands(TestContext testContext){
        queryBrands.invoke(testContext).baseAssert(testContext)
    }
}
