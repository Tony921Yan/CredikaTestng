package com.meiji.test.http.mall.userShop
import com.meiji.biz.request.http.mall.userShop.SearchGoodsBrandList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchGoodsBrandListTest extends BaseTest {
    SearchGoodsBrandList searchGoodsBrandList = new SearchGoodsBrandList()
    @Test(description = "搜索商品品牌列表" ,groups = ["prod","uat"],testName = "searchGoodsBrandList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void searchGoodsBrandList(TestContext testContext){
        searchGoodsBrandList.invoke(testContext).baseAssert(testContext)
    }

}
