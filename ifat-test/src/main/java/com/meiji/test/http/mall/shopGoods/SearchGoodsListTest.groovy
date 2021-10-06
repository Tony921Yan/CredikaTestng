package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.SearchGoodsList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchGoodsListTest extends BaseTest {
    SearchGoodsList searchGoodsList = new SearchGoodsList()
    @Test(description = "搜索商品列表搜索-综合 searchGoodsList" ,groups = ["prod","uat"],testName = "searchGoodsList1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsList(TestContext testContext){
        searchGoodsList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "首页商品列表搜索-新品 searchGoodsList-new",groups = ["prod","uat"],testName = "searchGoodsList-new",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsList1(TestContext testContext){
        searchGoodsList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "首页商品列表搜索-销售 searchGoodsList-sales",groups = ["prod","uat"],testName = "searchGoodsList-sales",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsList2(TestContext testContext){
        searchGoodsList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "首页商品列表搜索-价格 searchGoodsList-price",groups = ["prod","uat"],testName = "searchGoodsList-price",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsList3(TestContext testContext){
        searchGoodsList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商品分类-日常零食 searchGoodsList-richanglingshi",groups = ["prod","uat"],testName = "searchGoodsList-richanglingshi",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void serrchGoodsList4(TestContext testContext){
        searchGoodsList.invoke(testContext).baseAssert(testContext)
    }
}
