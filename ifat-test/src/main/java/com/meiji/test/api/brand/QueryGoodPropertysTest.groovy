package com.meiji.test.api.brand


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryGoodPropertysTest extends BaseTest {
    com.meiji.biz.request.api.brand.QueryGoodPropertys queryGoodPropertys = new com.meiji.biz.request.api.brand.QueryGoodPropertys()
    @Test(description = "商品属性分页查询 queryGoodPropertys" ,groups = ["prod","uat"],testName = "queryGoodPropertys",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryGoodPropertys(TestContext testContext){
        queryGoodPropertys.invoke(testContext).baseAssert(testContext)
    }
}
