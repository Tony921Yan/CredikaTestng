package com.credika.test.api.brand

import com.credika.biz.request.api.brand.CreateGoodPropertyGroup
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CreateGoodPropertyGroupTest extends BaseTest {
    CreateGoodPropertyGroup createGoodPropertyGroup = new CreateGoodPropertyGroup()
    @Test(description = "创建商品属性组 createGoodPropertyGroup" ,groups = ["prod","uat"],testName = "createGoodPropertyGroup",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createGoodPropertyGroup(TestContext testContext){
        //testContext.put("list",JsonUtil.objToJsonList(testContext.get("list")))
        createGoodPropertyGroup.invoke(testContext).baseAssert(testContext)
    }
}
