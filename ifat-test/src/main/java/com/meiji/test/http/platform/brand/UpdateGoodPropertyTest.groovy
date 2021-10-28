package com.meiji.test.http.platform.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.brand.UpdateGoodProperty
import com.miyuan.ifat.support.util.JsonUtil
import org.testng.annotations.Test

class UpdateGoodPropertyTest extends BaseTest {
    UpdateGoodProperty updateGoodProperty = new UpdateGoodProperty()
    @Test(description = "更新商品属性信息 updateGoodProperty" ,groups = ["prod","uat"],testName = "updateGoodProperty",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateGoodProperty(TestContext testContext){
//      testContext.put("goodPropertyValues", JsonUtil.objToJsonList(testContext.get("goodPropertyValues")))
        updateGoodProperty.invoke(testContext).baseAssert(testContext)
    }
}
