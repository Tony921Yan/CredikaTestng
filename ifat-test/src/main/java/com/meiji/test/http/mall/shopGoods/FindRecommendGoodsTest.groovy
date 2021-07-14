package com.meiji.test.http.mall.shopGoods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.mall.shopGoods.FindRecommendGoods
import org.testng.annotations.Test

class FindRecommendGoodsTest extends BaseTest {
    FindRecommendGoods findRecommendGoods = new FindRecommendGoods()
    @Test(description = "获取商品推荐列表 findRecommendGoods" ,groups = ["prod","uat"],testName = "findRecommendGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findRecommendGoods(TestContext testContext){
        findRecommendGoods.invoke(testContext).baseAssert(testContext)
    }
}
