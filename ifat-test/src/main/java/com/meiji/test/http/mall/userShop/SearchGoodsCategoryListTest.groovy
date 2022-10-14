package com.meiji.test.http.mall.userShop
import com.meiji.biz.request.http.mall.userShop.SearchGoodsListWithCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchGoodsCategoryListTest extends BaseTest {
    SearchGoodsListWithCategory searchGoodsListWithCategory = new SearchGoodsListWithCategory()
    @Test(description = "搜索商品分类列表" ,groups = ["prod","uat"],testName = "searchGoodsCategoryList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void searchGoodsListWithCategory(TestContext testContext){
        searchGoodsListWithCategory.invoke(testContext).baseAssert(testContext)
    }

}
