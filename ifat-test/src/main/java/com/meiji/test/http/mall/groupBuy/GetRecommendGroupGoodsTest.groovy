package com.meiji.test.http.mall.groupBuy
import com.meiji.biz.request.http.mall.groupBuy.GetGroupBuyGoods
import com.meiji.biz.request.http.mall.groupBuy.GetRecommendGroupGoods
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetRecommendGroupGoodsTest extends BaseTest {
    GetRecommendGroupGoods getRecommendGroupGoods = new GetRecommendGroupGoods()
    GetGroupBuyGoods getGroupBuyGoods = new GetGroupBuyGoods()
    @Test(description = "推荐开团商品 getRecommendGroupGoods" ,groups = ["prod","uat"],testName = "getRecommendGroupGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getRecommendGroupGoods(TestContext testContext){
        getGroupBuyGoods.invoke(testContext).baseAssert(testContext).afterinvoke(testContext)
        getRecommendGroupGoods.invoke(testContext).baseAssert(testContext)
    }
}