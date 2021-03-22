package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.UpdateShopModuleTemplate
import org.testng.annotations.Test

class UpdateShopModuleTemplateTest extends BaseTest {
    UpdateShopModuleTemplate updateShopModuleTemplate = new UpdateShopModuleTemplate()
    @Test(description = "更新店铺首页模块模板 updateShopModuleTemplate" ,groups = ["prod","uat"],testName = "updateShopModuleTemplate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopModuleTemplate(TestContext testContext){
        updateShopModuleTemplate.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
