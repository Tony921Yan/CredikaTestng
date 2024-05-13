package com.credika.test.http.OMS.order
import com.credika.biz.request.http.OMS.order.GetOrderByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderByPageTest extends BaseTest {
    GetOrderByPage getOrderByPage = new GetOrderByPage()
    @Test(description = "获取订单数据 getOrderByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-已审核 getOrderByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderByPage3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage3(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-出库中 getOrderByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderByPage4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage4(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-部分发货 getOrderByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderByPage50",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage50(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-已发货 getOrderByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderByPage5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage5(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-已签收 getOrderByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderByPage6",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage6(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-已完成 getOrderByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderByPage7",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage7(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-已取消 getOrderByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderByPage8",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage8(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-翻页 getOrderByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderByPage9",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage9(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }
}
