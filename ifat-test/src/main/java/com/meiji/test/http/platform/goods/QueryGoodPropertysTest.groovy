package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.QueryGoodPropertys
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryGoodPropertysTest extends BaseTest {
    QueryGoodPropertys queryGoodPropertys = new QueryGoodPropertys()
    @Test(description = "查询商品属性-商详 queryGoodPropertys" ,groups = ["prod","uat"],testName = "queryGoodPropertys",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryGoodPropertys(TestContext testContext){
        queryGoodPropertys.invoke(testContext).baseAssert(testContext)
    }
}
