package com.credika.test.http.platform.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.brand.QueryGoodPropertysByPage
import org.testng.annotations.Test

class QueryGoodPropertysByPageTest extends BaseTest {
    QueryGoodPropertysByPage queryGoodPropertysByPage = new QueryGoodPropertysByPage()
    @Test(description = "商品属性分页查询 queryGoodPropertys" ,groups = ["prod","uat"],testName = "queryGoodPropertysByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryGoodPropertysByPage(TestContext testContext){
        queryGoodPropertysByPage.invoke(testContext).baseAssert(testContext)
        queryGoodPropertysByPage.specialAssert(testContext)
    }
}
