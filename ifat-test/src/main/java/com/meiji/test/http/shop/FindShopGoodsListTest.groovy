package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.FindShopGoodsList
import org.testng.annotations.Test

class FindShopGoodsListTest extends BaseTest {
    FindShopGoodsList findShopGoodsList = new FindShopGoodsList()
    @Test(description = "查询店铺商品列表 findShopGoodsList" ,groups = ["prod","uat"],testName = "findShopGoodsList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopGoodsList(TestContext testContext){
        findShopGoodsList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
