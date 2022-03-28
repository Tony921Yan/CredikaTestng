package com.meiji.test.http.platform.stockManger
import com.meiji.biz.request.http.platform.stockManger.SearchActivityGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchActivityGoodsTest extends BaseTest {
    SearchActivityGoods searchActivityGoods = new SearchActivityGoods()
    @Test(description = "搜索活动下的商品,searchActivityGoods ", groups = ["prod", "uat"], testName = "searchActivityGoods",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void searchActivityGoods(TestContext testContext) {
        searchActivityGoods.invoke(testContext).baseAssert(testContext)
    }
}


