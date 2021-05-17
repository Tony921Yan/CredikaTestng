package com.meiji.test.http.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.brand.QueryBrandsByPage
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class QueryBrandsByPageTest extends BaseTest {
    QueryBrandsByPage queryBrandsByPage = new QueryBrandsByPage()
    @Test(description = "品牌分页查询 queryBrands" ,groups = ["prod","uat"],testName = "queryBrandsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryBrandsByPage(TestContext testContext){
        //testContext.put("condition", JsonUtil.objToJsonList(testContext.get("condition")))
//        testContext.put("condition", JsonUtil.strToJson(JsonUtil.toJsonString(testContext.get("condition"))))
        testContext.put("condition",JsonUtil.strToJson(testContext.get("condition")))
        queryBrandsByPage.invoke(testContext).baseAssert(testContext)
    }
}
