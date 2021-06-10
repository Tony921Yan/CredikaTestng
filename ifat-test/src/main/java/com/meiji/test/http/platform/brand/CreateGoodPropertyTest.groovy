package com.meiji.test.http.platform.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.brand.CreateGoodProperty
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class CreateGoodPropertyTest extends BaseTest {
    CreateGoodProperty createGoodProperty = new CreateGoodProperty()
    @Test(description = "创建商品属性 createGoodProperty" ,groups = ["prod","uat"],testName = "createGoodProperty",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createGoodProperty(TestContext testContext){
        //testContext.put("goodPropertyValues", JsonUtil.objToJsonList(testContext.get("goodPropertyValues")))
        createGoodProperty.invoke(testContext).baseAssert(testContext)
    }
}
