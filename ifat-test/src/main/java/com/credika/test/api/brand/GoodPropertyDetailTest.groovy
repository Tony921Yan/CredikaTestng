package com.credika.test.api.brand

import com.credika.biz.request.api.brand.GoodPropertyDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
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
