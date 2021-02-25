package com.meiji.test.api.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.brand.UpdateGoodPropertyGroup
import com.meiji.util.JsonUtil
import org.testng.annotations.Test

class UpdateGoodPropertyGroupTest extends BaseTest {
    UpdateGoodPropertyGroup updateGoodPropertyGroup = new UpdateGoodPropertyGroup()
    @Test(description = "更新商品属性组 updateGoodPropertyGroup" ,groups = ["prod","uat"],testName = "updateGoodPropertyGroup",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateGoodPropertyGroup(TestContext testContext){
        testContext.put("list",JsonUtil.objToJsonList(testContext.get("list")))
        updateGoodPropertyGroup.invoke(testContext).baseAssert(testContext)
    }
}
