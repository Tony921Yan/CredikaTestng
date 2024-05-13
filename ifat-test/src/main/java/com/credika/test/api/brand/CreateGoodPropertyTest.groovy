package com.credika.test.api.brand

import com.credika.biz.request.api.brand.CreateGoodProperty
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CreateGoodPropertyTest extends BaseTest {
    CreateGoodProperty createGoodProperty = new CreateGoodProperty()
    @Test(description = "创建属性 createGoodProperty" ,groups = ["prod","uat"],testName = "createGoodProperty",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createGoodProperty(TestContext testContext){
        //testContext.put("goodPropertyValues", JsonUtil.objToJsonList(testContext.get("goodPropertyValues")))
        createGoodProperty.invoke(testContext).baseAssert(testContext)
    }
}
