package com.meiji.test.http.shop

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.UpdateShopModule
import org.testng.annotations.Test

class UpdateShopModuleTest extends BaseTest {
    UpdateShopModule updateShopModule = new UpdateShopModule()
    @Test(description = "更新店铺首页模块 updateShopModule" ,groups = ["prod","uat"],testName = "updateShopModule",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopModule(TestContext testContext){
        updateShopModule.invoke(testContext).baseAssert(testContext)
    }
}
