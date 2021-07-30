package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.FindOfficeShopModuleList
import com.meiji.biz.request.http.mall.shopGoods.SearchGoodsList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchGoodsListTest extends BaseTest {
    SearchGoodsList searchGoodsList = new SearchGoodsList()
    @Test(description = "搜索商品列表 searchGoodsList" ,groups = ["prod","uat"],testName = "searchGoodsList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsList(TestContext testContext){
        searchGoodsList.invoke(testContext).baseAssert(testContext)
    }
}
