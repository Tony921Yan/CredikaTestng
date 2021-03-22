package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.DeleteShopModule
import org.testng.annotations.Test

class DeleteShopModuleTest extends BaseTest {
    DeleteShopModule deleteShopModule = new DeleteShopModule()
    @Test(description = "删除店铺首页模块 deleteShopModule" ,groups = ["prod","uat"],testName = "deleteShopModule",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteShopModule(TestContext testContext){
        deleteShopModule.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
