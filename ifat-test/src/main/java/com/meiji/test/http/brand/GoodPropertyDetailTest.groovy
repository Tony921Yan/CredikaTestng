package com.meiji.test.http.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.brand.GoodPropertyDetail
import org.testng.annotations.Test

class GoodPropertyDetailTest extends BaseTest {
    GoodPropertyDetail goodPropertyDetail = new GoodPropertyDetail()
    @Test(description = "商品属性详情 goodPropertyDetail" ,groups = ["prod","uat"],testName = "goodPropertyDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodPropertyDetail(TestContext testContext){
       /* testContext.put("goodPropertyValues", JsonUtil.objToJsonList(testContext.get("goodPropertyValues")))*/
        goodPropertyDetail.invoke(testContext).baseAssert(testContext)
    }
}
