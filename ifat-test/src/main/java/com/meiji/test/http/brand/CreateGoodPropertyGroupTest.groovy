package com.meiji.test.http.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.brand.CreateGoodPropertyGroup
import com.miyuan.ifat.support.util.JsonUtil
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
