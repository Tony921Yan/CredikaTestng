package com.meiji.test.http.platform.order

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.order.GetOrderByPage
import org.testng.annotations.Test

class GetOrderByPageTest extends BaseTest {
    GetOrderByPage getOrderByPage = new GetOrderByPage()
    @Test(description = "获取订单数据 getOrderByPage" ,groups = ["prod","uat"],testName = "uatGetOrderByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }
    @Test(description = "筛选蜜源App获取订单数据 uatGetOrderByPage-SearchFromMiyuanApp",groups = ["prod","uat"],testName = "uatGetOrderByPage-SearchFromMiyuanApp",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void uatGetOrderByPage1(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "筛选蜜源App获取订单数据 uatGetOrderByPage-SearchFromMiyuanWeixin",groups = ["prod","uat"],testName = "uatGetOrderByPage-SearchFromMiyuanWeiXin",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void uatGetOrderByPage2(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }
}
