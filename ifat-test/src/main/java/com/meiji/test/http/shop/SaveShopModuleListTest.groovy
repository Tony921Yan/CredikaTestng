package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.SaveShopModuleList
import org.testng.annotations.Test

class SaveShopModuleListTest extends BaseTest {
    SaveShopModuleList saveShopModuleList = new SaveShopModuleList()
    @Test(description = "保存店铺首页模块列表 saveShopModuleList" ,groups = ["prod","uat"],testName = "saveShopModuleList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void saveShopModuleList(TestContext testContext){
        saveShopModuleList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
