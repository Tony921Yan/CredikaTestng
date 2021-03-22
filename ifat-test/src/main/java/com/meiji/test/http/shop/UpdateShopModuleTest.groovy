package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.UpdateShopModule
import org.testng.annotations.Test

class UpdateShopModuleTest extends BaseTest {
    UpdateShopModule updateShopModule = new UpdateShopModule()
    @Test(description = "更新店铺首页模块 updateShopModule" ,groups = ["prod","uat"],testName = "updateShopModule",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopModule(TestContext testContext){
        updateShopModule.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
