package com.credika.test.http.mall.orderInfo

import com.credika.biz.request.http.mall.orderInfo.PageOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageOrderTest extends BaseTest {
    PageOrder pageOrder = new PageOrder()
    @Test(description = "分页订单查询 pageOrder" ,groups = ["prod","uat"],testName = "mall-pageOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrder(TestContext testContext){
        pageOrder.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "全部订单 pageOrder-all",groups = ["prod","uat"],testName = "mall-pageOrder-all",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrder1(TestContext testContext){
        pageOrder.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "订单-待付款 mall-pageOrder-daifukuan",groups = ["prod","uat"],testName = "mall-pageOrder-daifukuan",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrder2(TestContext testContext){
        pageOrder.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "订单-待发货 mall-pageOrder-daifahuo",groups = ["prod","uat"],testName = "mall-pageOrder-daifahuo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrder3(TestContext testContext){
        pageOrder.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "订单-待收货 mall-pageOrder-daishouhuo",groups = ["prod","uat"],testName = "mall-pageOrder-daishouhuo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrder4(TestContext testContext){
        pageOrder.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "订单-已完成 mall-pageOrder-yiwancheng",groups = ["prod","uat"],testName = "mall-pageOrder-yiwancheng",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrder5(TestContext testContext){
        pageOrder.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "订单-精确搜索 mall-pageOrder-search",groups = ["prod","uat"],testName = "mall-pageOrder-search",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrderSearch(TestContext testContext){
        pageOrder.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "订单-晒单广场-晒单 mall-pageOrder-search",groups = ["prod","uat"],testName = "mall-pageOrder-search",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageOrder111(TestContext testContext){
        pageOrder.invoke(testContext).baseAssert(testContext)
    }
}
