package com.meiji.test.http.platform.order

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.order.GetOrderByPage
import org.testng.annotations.Test

class GetOrderByPageTest extends BaseTest {
    GetOrderByPage getOrderByPage = new GetOrderByPage()
    @Test(description = "获取订单数据 getOrderByPage" ,groups = ["prod","uat"],testName = "getOrderByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-自然下单 getOrderByPage" ,groups = ["prod","uat"],testName = "getOrderByPage1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage1(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "筛选蜜源App获取订单数据 uatGetOrderByPage-SearchFromMiyuanApp",groups = ["prod","uat"],testName = "GetOrderByPage-SearchFromMiyuanApp",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage2(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "筛选蜜源App获取订单数据 uatGetOrderByPage-SearchFromMiyuanWeixin",groups = ["prod","uat"],testName = "GetOrderByPage-SearchFromMiyuanWeiXin",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void uatGetOrderByPage3(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }
}
