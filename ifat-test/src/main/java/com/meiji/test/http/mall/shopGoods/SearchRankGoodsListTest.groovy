package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.SearchRankGoodsList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchRankGoodsListTest extends BaseTest {
    SearchRankGoodsList searchRankGoodsList = new SearchRankGoodsList()
    @Test(description = "销量排行榜列表 searchRankGoodsList" ,groups = ["prod","uat"],testName = "searchRankGoodsList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchRankGoodsList(TestContext testContext){
        testContext.put("rankCategoryId",null)     //不传则查询全部
        testContext.put("shopId","1406506069131296")
        searchRankGoodsList.invoke(testContext).baseAssert(testContext)
    }
}
