package com.credika.test.http.shop.goods

import com.credika.biz.request.http.shop.goods.SearchGoodsList
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
