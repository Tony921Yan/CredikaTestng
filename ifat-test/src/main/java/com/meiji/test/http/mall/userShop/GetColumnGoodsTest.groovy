package com.meiji.test.http.mall.userShop

import com.meiji.biz.request.http.mall.userShop.GetColumnGoods
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
class GetColumnGoodsTest extends BaseTest{
    GetColumnGoods getColumnGoods = new GetColumnGoods()
    @Test(description = "获取栏目下商品数据(首页-货比三家） getColumnGoods" ,groups = ["prod","uat"],testName = "getColumnGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getColumnGoods(TestContext testContext){
        getColumnGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取栏目下商品数据(首页-货比三家）-翻页 getColumnGoods" ,groups = ["prod","uat"],testName = "getColumnGoods1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getColumnGoods1(TestContext testContext){
        getColumnGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取栏目下商品数据-首页-s姆同款 getColumnGoods" ,groups = ["prod","uat"],testName = "getColumnGoods2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getColumnGoods2(TestContext testContext){
        getColumnGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取栏目下商品数据-首页-大牌严选 getColumnGoods" ,groups = ["prod","uat"],testName = "getColumnGoods3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getColumnGoods3(TestContext testContext){
        getColumnGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取栏目下商品数据-首页-美记特卖 getColumnGoods" ,groups = ["prod","uat"],testName = "getColumnGoods4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getColumnGoods4(TestContext testContext){
        getColumnGoods.invoke(testContext).baseAssert(testContext)
    }
}
