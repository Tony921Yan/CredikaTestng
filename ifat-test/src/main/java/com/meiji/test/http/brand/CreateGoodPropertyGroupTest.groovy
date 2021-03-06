package com.meiji.test.http.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.brand.CreateGoodPropertyGroup
import com.meiji.util.JsonUtil
import org.testng.annotations.Test

class CreateGoodPropertyGroupTest extends BaseTest {
    CreateGoodPropertyGroup createGoodPropertyGroup = new CreateGoodPropertyGroup()
    @Test(description = "创建商品属性组 createGoodPropertyGroup" ,groups = ["prod","uat"],testName = "createGoodPropertyGroup",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createGoodPropertyGroup(TestContext testContext){
        testContext.put("list",JsonUtil.objToJsonList(testContext.get("list")))
        createGoodPropertyGroup.invoke(testContext).baseAssert(testContext)
    }
}
