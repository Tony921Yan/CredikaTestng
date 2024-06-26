package com.credika.test.http.mall.shopGoods


import com.credika.biz.request.http.mall.shopGoods.SearchGoodsListNew
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchGoodsListNewTest extends BaseTest {
    SearchGoodsListNew searchGoodsListNew = new SearchGoodsListNew()
    @Test(description = "新搜索商品列表 searchGoodsListNew" ,groups = ["prod","uat"],testName = "searchGoodsListNew",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsListNew(TestContext testContext){
        searchGoodsListNew.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "新搜索商品列表-商品标签/送礼标签 searchGoodsListNew" ,groups = ["prod","uat"],testName = "searchGoodsListNew1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchGoodsListNew1(TestContext testContext){
        searchGoodsListNew.invoke(testContext).baseAssert(testContext)
    }
}
