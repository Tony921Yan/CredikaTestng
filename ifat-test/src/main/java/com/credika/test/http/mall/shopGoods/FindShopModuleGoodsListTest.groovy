package com.credika.test.http.mall.shopGoods

import com.credika.biz.request.http.mall.shopGoods.FindShopModuleGoodsList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopModuleGoodsListTest extends BaseTest {
    FindShopModuleGoodsList findShopModuleGoodsList = new FindShopModuleGoodsList()
    @Test(description = "查询店铺首页模块商品列表 findShopModuleGoodsList" ,groups = ["prod","uat"],testName = "findShopModuleGoodsList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopModuleGoodsList(TestContext testContext){
        findShopModuleGoodsList.invoke(testContext).baseAssert(testContext)
    }
}
