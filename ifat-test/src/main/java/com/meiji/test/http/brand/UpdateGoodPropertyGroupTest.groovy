package com.meiji.test.http.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.brand.UpdateGoodPropertyGroup
import com.miyuan.ifat.support.util.JsonUtil
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
