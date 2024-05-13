package com.credika.test.api.brand

import com.credika.biz.request.api.brand.QueryGoodPropertys
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryGoodPropertysTest extends BaseTest {
    QueryGoodPropertys queryGoodPropertys = new QueryGoodPropertys()
    @Test(description = "商品属性分页查询 queryGoodPropertys" ,groups = ["prod","uat"],testName = "queryGoodPropertys",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryGoodPropertys(TestContext testContext){
        queryGoodPropertys.invoke(testContext).baseAssert(testContext)
    }
}
