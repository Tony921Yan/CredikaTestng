package com.meiji.test.http.shop.module

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.module.UpdateShopModuleTemplate
import org.testng.annotations.Test

class UpdateShopModuleTemplateTest extends BaseTest {
    UpdateShopModuleTemplate updateShopModuleTemplate = new UpdateShopModuleTemplate()
    @Test(description = "更新店铺首页模块模板 updateShopModuleTemplate" ,groups = ["prod","uat"],testName = "updateShopModuleTemplate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopModuleTemplate(TestContext testContext){
        updateShopModuleTemplate.invoke(testContext).baseAssert(testContext)
    }
}
