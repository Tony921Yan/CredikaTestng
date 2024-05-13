package com.credika.test.http.OMS.goods

import com.credika.biz.request.http.OMS.goods.QueryGoodPropertys
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryGoodPropertysTest extends BaseTest {
    QueryGoodPropertys queryGoodPropertys = new QueryGoodPropertys()
    @Test(description = "获取商品信息-商品属性 queryGoodPropertys" ,groups = ["prod","uat"],testName = "queryGoodPropertys",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void queryGoodPropertys(TestContext testContext){
        queryGoodPropertys.invoke(testContext).baseAssert(testContext)
    }
}

