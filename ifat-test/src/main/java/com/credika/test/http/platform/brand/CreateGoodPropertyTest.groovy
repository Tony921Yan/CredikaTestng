package com.credika.test.http.platform.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.brand.CreateGoodProperty
import org.testng.annotations.Test

class CreateGoodPropertyTest extends BaseTest {
    CreateGoodProperty createGoodProperty = new CreateGoodProperty()
    @Test(description = "创建商品属性 createGoodProperty" ,groups = ["prod","uat"],testName = "createGoodProperty",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createGoodProperty(TestContext testContext){
        createGoodProperty.invoke(testContext).baseAssert(testContext)
    }
}
