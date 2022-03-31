package com.meiji.test.http.platform.orderDetailManage

import com.meiji.biz.request.http.platform.orderDetailManage.GetOrderCount
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderCountTest extends BaseTest {
    GetOrderCount getOrderCount = new GetOrderCount()

    @Test(description = "获取订单计数-全部 getOrderCount", groups = ["prod", "uat"], testName = "getOrderCount-all",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void getOrderCount(TestContext testContext) {
        getOrderCount.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单计数-时间 getOrderCount", groups = ["prod", "uat"], testName = "getOrderCount-time",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void getOrderCount1(TestContext testContext) {
        getOrderCount.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单计数-店铺 getOrderCount", groups = ["prod", "uat"], testName = "getOrderCount-shopName",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void getOrderCount2(TestContext testContext) {
        getOrderCount.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单计数-收货人 getOrderCount", groups = ["prod", "uat"], testName = "getOrderCount-receiverMsg",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void getOrderCount3(TestContext testContext) {
        getOrderCount.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单计数-供应商 getOrderCount", groups = ["prod", "uat"], testName = "getOrderCount-supplierName",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void getOrderCount4(TestContext testContext) {
        getOrderCount.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单计数-母单号 getOrderCount", groups = ["prod", "uat"], testName = "getOrderCount-parentOrderCode",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void getOrderCount5(TestContext testContext) {
        getOrderCount.invoke(testContext).baseAssert(testContext)
    }
}



