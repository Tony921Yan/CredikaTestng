package com.credika.test.http.mall.shopGoods

import com.credika.biz.request.http.mall.shopGoods.SearchGoodsListWithCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchGoodsListWithCategoryTest extends BaseTest {
    SearchGoodsListWithCategory searchGoodsListWithCategory = new SearchGoodsListWithCategory()
    @Test(description = "搜索分类商品列表-综合 searchGoodsListWithCategory" ,groups = ["prod","uat"],testName = "searchGoodsListWithCategory-comprehensiveSort",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsListWithCategory(TestContext testContext){
        searchGoodsListWithCategory.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索分类商品列表-新品 searchGoodsListWithCategory" ,groups = ["prod","uat"],testName = "searchGoodsListWithCategory-publishTimeSort",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsListWithCategory2(TestContext testContext){
        searchGoodsListWithCategory.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索分类商品列表-销量 searchGoodsListWithCategory" ,groups = ["prod","uat"],testName = "searchGoodsListWithCategory-salesSort",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsListWithCategory3(TestContext testContext){
        searchGoodsListWithCategory.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索分类商品列表-价格-升序 searchGoodsListWithCategory" ,groups = ["prod","uat"],testName = "searchGoodsListWithCategory-priceSort-asc",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsListWithCategory4(TestContext testContext){
        searchGoodsListWithCategory.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "搜索分类商品列表-价格-降序 searchGoodsListWithCategory" ,groups = ["prod","uat"],testName = "searchGoodsListWithCategory-priceSort-desc",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsListWithCategory5(TestContext testContext){
        searchGoodsListWithCategory.invoke(testContext).baseAssert(testContext)
    }
}
