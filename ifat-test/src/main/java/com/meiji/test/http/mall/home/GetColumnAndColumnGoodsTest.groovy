package com.meiji.test.http.mall.home

import com.meiji.biz.request.http.mall.home.GetColumnAndColumnGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/12 22:32
 @version v2.3
 */
class GetColumnAndColumnGoodsTest extends BaseTest {
    GetColumnAndColumnGoods getColumnAndColumnGoods = new GetColumnAndColumnGoods()
    @Test(description = "获取栏目和栏目下商品数据-首页前3条 getColumnAndColumnGoods" ,groups = ["prod","uat"],testName = "getColumnAndColumnGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getColumnAndColumnGoods(TestContext testContext){
        getColumnAndColumnGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取栏目和栏目下商品数据-第1页 getColumnAndColumnGoods" ,groups = ["prod","uat"],testName = "getColumnAndColumnGoods1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getColumnAndColumnGoods1(TestContext testContext){
        getColumnAndColumnGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取栏目和栏目下商品数据-第2页 getColumnAndColumnGoods" ,groups = ["prod","uat"],testName = "getColumnAndColumnGoods2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getColumnAndColumnGoods2(TestContext testContext){
        getColumnAndColumnGoods.invoke(testContext).baseAssert(testContext)
    }
}
