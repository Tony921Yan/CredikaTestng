package com.meiji.test.http.platform.orderDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.orderDetailManage.GetOrderByPage
import org.testng.annotations.Test

class GetOrderByPageTest extends BaseTest {
    GetOrderByPage getOrderByPage = new GetOrderByPage()
    Random rand = new Random()
    @Test(description = "获取订单数据-全部 getOrderByPage" ,groups = ["prod","uat"],testName = "getOrderByPage-all",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单类型 GetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderType1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage2(TestContext testContext){
       /* def condition = testContext.get("condition")
        condition.put("orderType",rand.nextInt(4)+1)
        testContext.put("condition",condition)
        testContext.put("page",1)
        testContext.put("rows",20)*/
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单类型 GetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderType2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage3(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }


    @Test(description = "获取订单数据-订单类型 GetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderType3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage4(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单类型 GetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderType4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage5(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }


    @Test(description = "获取订单数据-订单状态 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderStatus1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage6(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单状态 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderStatus2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage7(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单状态 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderStatus3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage8(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单状态 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderStatus4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage9(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单状态 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderStatus50",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage1(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单状态 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderStatus5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage10(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单状态 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderStatus6",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage11(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单状态 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderStatus7",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage12(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单状态 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderStatus8",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage13(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单来源 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-sourceType0",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage14(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-订单来源 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-sourceType1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage15(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-子单号 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-orderCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage16(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-母单号 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-parentOrderCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage17(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取订单数据-组合查询 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-18",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage18(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }
//v2.8新增“商品名称”查询
    @Test(description = "获取订单数据-商品名称 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-goodsName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetOrderByPage19(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
    }

//    @Test(description = "获取订单数据-订单类型：拼团订单 uatGetOrderByPage",groups = ["prod","uat"],testName = "GetOrderByPage-pintuan",
//            dataProvider = "dataProvider",dataProviderClass = TestData.class)
//    public void GetOrderByPage20(TestContext testContext){
//        getOrderByPage.invoke(testContext).baseAssert(testContext)
//    }


}
