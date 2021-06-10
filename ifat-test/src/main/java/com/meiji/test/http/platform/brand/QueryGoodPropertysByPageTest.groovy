package com.meiji.test.http.platform.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.brand.QueryGoodPropertysByPage
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class QueryGoodPropertysByPageTest extends BaseTest {
    QueryGoodPropertysByPage queryGoodPropertysByPage = new QueryGoodPropertysByPage()
    @Test(description = "商品属性分页查询 queryGoodPropertys" ,groups = ["prod","uat"],testName = "queryGoodPropertysByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryGoodPropertysByPage(TestContext testContext){
        //testContext.put("condition", JsonUtil.strToJson(testContext.get("condition")))
        queryGoodPropertysByPage.invoke(testContext).baseAssert(testContext)
    }
}
