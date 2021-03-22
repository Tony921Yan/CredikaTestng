package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.AddShopModule
import org.testng.annotations.Test

class AddShopModuleTest extends BaseTest {
    AddShopModule addShopModule = new AddShopModule()
    @Test(description = "新增店铺首页模块 addShopModule" ,groups = ["prod","uat"],testName = "addShopModule",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addShopModule(TestContext testContext){
        addShopModule.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
