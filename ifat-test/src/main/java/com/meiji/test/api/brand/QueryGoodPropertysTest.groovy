package com.meiji.test.api.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.brand.QueryGoodPropertys
import org.testng.annotations.Test

class QueryGoodPropertysTest extends BaseTest {
    QueryGoodPropertys queryGoodPropertys = new QueryGoodPropertys()
    @Test(description = "分页查询 queryGoodPropertys" ,groups = ["prod","uat"],testName = "queryGoodPropertys",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryGoodPropertys(TestContext testContext){
        queryGoodPropertys.invoke(testContext).baseAssert(testContext)
    }
}
