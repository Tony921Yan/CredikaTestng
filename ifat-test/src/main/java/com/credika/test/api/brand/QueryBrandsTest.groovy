package com.credika.test.api.brand

import com.credika.biz.request.api.brand.QueryBrands
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryBrandsTest extends BaseTest {
    QueryBrands queryBrands = new QueryBrands()
    @Test(description = "品牌分页查询 queryBrands" ,groups = ["prod","uat"],testName = "queryBrands",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryBrands(TestContext testContext){
        queryBrands.invoke(testContext).baseAssert(testContext)
    }
}
