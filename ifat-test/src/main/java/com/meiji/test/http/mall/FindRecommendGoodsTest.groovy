package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.AddUserAddress
import com.meiji.request.http.mall.FindRecommendGoods
import org.testng.annotations.Test

class FindRecommendGoodsTest extends BaseTest {
    FindRecommendGoods findRecommendGoods = new FindRecommendGoods()
    @Test(description = "获取商品推荐列表 findRecommendGoods" ,groups = ["prod","uat"],testName = "findRecommendGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findRecommendGoods(TestContext testContext){
        findRecommendGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
