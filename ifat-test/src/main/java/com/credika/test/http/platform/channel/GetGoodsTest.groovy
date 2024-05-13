package com.credika.test.http.platform.channel

import com.credika.biz.request.http.platform.channel.GetGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/11/18-17:50
 @version v2.1
 */
class GetGoodsTest extends BaseTest {
    GetGoods getGoods = new GetGoods()
    @Test(description = "商品管理-频道管理-货比三家商品列表 getGoods" ,groups = ["prod","uat"],testName = "getGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoods(TestContext testContext){
        getGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商品管理-频道管理-晒单商品列表 getGoods" ,groups = ["prod","uat"],testName = "getGoods1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoods1(TestContext testContext){
        getGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商品管理-频道管理-美记精选-S姆同款商品列表 getGoods" ,groups = ["prod","uat"],testName = "getGoods2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoods2(TestContext testContext){
        getGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商品管理-频道管理-美记精选-大牌严选商品列表 getGoods" ,groups = ["prod","uat"],testName = "getGoods3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoods3(TestContext testContext){
        getGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商品管理-频道管理-美记精选-美记特卖商品列表 getGoods" ,groups = ["prod","uat"],testName = "getGoods4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoods4(TestContext testContext){
        getGoods.invoke(testContext).baseAssert(testContext)
    }
}
