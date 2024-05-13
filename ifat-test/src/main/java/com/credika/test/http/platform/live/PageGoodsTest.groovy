package com.credika.test.http.platform.live
import com.credika.biz.request.http.platform.live.PageGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageGoodsTest extends BaseTest {
    PageGoods pageGoods = new PageGoods()
    @Test(description = "查询商品列表 pageGoods-全部" ,groups = ["prod","uat"],testName = "pageGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageGoods(TestContext testContext){
        pageGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询商品列表 pageGoods-未审核" ,groups = ["prod","uat"],testName = "pageGoods1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageGoods1(TestContext testContext){
        pageGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询商品列表 pageGoods-审核中" ,groups = ["prod","uat"],testName = "pageGoods2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageGoods2(TestContext testContext){
        pageGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询商品列表 pageGoods-审核通过" ,groups = ["prod","uat"],testName = "pageGoods3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageGoods3(TestContext testContext){
        pageGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "查询商品列表 pageGoods-审核失败" ,groups = ["prod","uat"],testName = "pageGoods4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageGoods4(TestContext testContext){
        pageGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

}
