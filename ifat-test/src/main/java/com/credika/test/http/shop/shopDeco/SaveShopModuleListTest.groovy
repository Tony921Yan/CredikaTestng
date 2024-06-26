package com.credika.test.http.shop.shopDeco

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.shop.shopDeco.SaveShopModuleList
import org.testng.annotations.Test

class SaveShopModuleListTest extends BaseTest {
    SaveShopModuleList saveShopModuleList = new SaveShopModuleList()
    @Test(description = "保存店铺首页模块列表 saveShopModuleList" ,groups = ["prod","uat"],testName = "saveShopModuleList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void saveShopModuleList(TestContext testContext){
        saveShopModuleList.invoke(testContext).baseAssert(testContext)
    }
}
