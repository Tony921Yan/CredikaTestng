package com.meiji.test.http.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.brand.UpdateGoodProperty
import com.meiji.util.JsonUtil
import org.testng.annotations.Test

class UpdateGoodPropertyTest extends BaseTest {
    UpdateGoodProperty updateGoodProperty = new UpdateGoodProperty()
    @Test(description = "更新商品属性信息 updateGoodProperty" ,groups = ["prod","uat"],testName = "updateGoodProperty",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateGoodProperty(TestContext testContext){
testContext.put("goodPropertyValues", JsonUtil.objToJsonList(testContext.get("goodPropertyValues")))
updateGoodProperty.invoke(testContext).baseAssert(testContext)
    }
}
