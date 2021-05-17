package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopModuleGoodsListTest extends BaseTest {
    com.meiji.biz.request.http.mall.FindShopModuleGoodsList findShopModuleGoodsList = new com.meiji.biz.request.http.mall.FindShopModuleGoodsList()
    @Test(description = "查询店铺首页模块商品列表 findShopModuleGoodsList" ,groups = ["prod","uat"],testName = "findShopModuleGoodsList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopModuleGoodsList(TestContext testContext){
        findShopModuleGoodsList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
