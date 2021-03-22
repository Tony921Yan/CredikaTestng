package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.FindShopModuleGoodsList
import org.testng.annotations.Test

class FindShopModuleGoodsListTest extends BaseTest {
    FindShopModuleGoodsList findShopModuleGoodsList = new FindShopModuleGoodsList()
    @Test(description = "查询店铺首页模块商品列表 findShopModuleGoodsList" ,groups = ["prod","uat"],testName = "findShopModuleGoodsList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopModuleGoodsList(TestContext testContext){
        findShopModuleGoodsList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
