package com.credika.test.http.mall.userShop


import com.credika.biz.request.http.mall.userShop.GetDefaultTopicGoods
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
class GetDefaultTopicGoodsTest extends BaseTest{//getTopicGoods 接口
    GetDefaultTopicGoods getDefaultTopicGoods = new GetDefaultTopicGoods()
    @Test(description = "获取专题下的商品 getDefaultTopicGoods" ,groups = ["prod","uat"],testName = "getDefaultTopicGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getDefaultTopicGoods(TestContext testContext){
        getDefaultTopicGoods.invoke(testContext).baseAssert(testContext)
    }
}
