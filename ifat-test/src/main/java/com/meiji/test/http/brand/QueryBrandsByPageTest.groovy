package com.meiji.test.http.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.brand.QueryBrandsByPage
import com.meiji.util.JsonUtil
import org.testng.annotations.Test

class QueryBrandsByPageTest extends BaseTest {
    QueryBrandsByPage queryBrandsByPage = new QueryBrandsByPage()
    @Test(description = "品牌分页查询 queryBrands" ,groups = ["prod","uat"],testName = "queryBrandsByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryBrandsByPage(TestContext testContext){
        //testContext.put("condition", JsonUtil.objToJsonList(testContext.get("condition")))
        testContext.put("condition", JsonUtil.strToJson(JsonUtil.toJsonString(testContext.get("condition"))))
        queryBrandsByPage.invoke(testContext).baseAssert(testContext)
    }
}
