package com.meiji.test.http.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.brand.CreateGoodProperty
import com.meiji.util.JsonUtil
import org.testng.annotations.Test

class CreateGoodPropertyTest extends BaseTest {
    CreateGoodProperty createGoodProperty = new CreateGoodProperty()
    @Test(description = "创建属性 createGoodProperty" ,groups = ["prod","uat"],testName = "createGoodProperty",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createGoodProperty(TestContext testContext){
        testContext.put("goodPropertyValues", JsonUtil.objToJsonList(testContext.get("goodPropertyValues")))
        createGoodProperty.invoke(testContext).baseAssert(testContext)
    }
}
