package com.credika.test.http.mall.userShop


import com.credika.biz.request.http.mall.userShop.GetTopicGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/18-13:50
 @version v2.1
 */
class GetTopicGoodsTest extends BaseTest{
    GetTopicGoods getTopicGoods = new GetTopicGoods()
    @Test(description = "获取专题下的商品 getTopicGoods" ,groups = ["prod","uat"],testName = "getTopicGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getTopicGoods(TestContext testContext){
        getTopicGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取专题下的商品-首页美记生鲜安心买 getTopicGoods" ,groups = ["prod","uat"],testName = "getTopicGoods1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getTopicGoods1(TestContext testContext){
        getTopicGoods.invoke(testContext).baseAssert(testContext)
    }
}
