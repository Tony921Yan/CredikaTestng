package com.meiji.test.api.brand


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GoodPropertyDetailTest extends BaseTest {
    com.meiji.biz.request.api.brand.GoodPropertyDetail goodPropertyDetail = new com.meiji.biz.request.api.brand.GoodPropertyDetail()
    @Test(description = "商品属性详情 goodPropertyDetail" ,groups = ["prod","uat"],testName = "goodPropertyDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodPropertyDetail(TestContext testContext){
       /* testContext.put("goodPropertyValues", JsonUtil.objToJsonList(testContext.get("goodPropertyValues")))*/
        goodPropertyDetail.invoke(testContext).baseAssert(testContext)
    }
}
