package com.credika.test.http.platform.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.brand.UpdateGoodPropertyGroup
import org.testng.annotations.Test

class UpdateGoodPropertyGroupTest extends BaseTest { //商品组更新报未知错误，因此功能未使用，暂不处理
    UpdateGoodPropertyGroup updateGoodPropertyGroup = new UpdateGoodPropertyGroup()
    @Test(description = "更新商品属性组 updateGoodPropertyGroup" ,groups = ["prod","uat"],testName = "updateGoodPropertyGroup",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateGoodPropertyGroup(TestContext testContext){
        updateGoodPropertyGroup.invoke(testContext).baseAssert(testContext)
    }
}
