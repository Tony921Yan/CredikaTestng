package com.meiji.test.http.platform.aftersalesDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.aftersalesDetailManage.GetOrderAfterByPage
import org.testng.annotations.Test

class GetOrderAfterByPageTest extends BaseTest {
    GetOrderAfterByPage getOrderAfterByPage = new GetOrderAfterByPage()
    @Test(description = "获取售后单分页-默认-下单时间 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-售后状态-待审核 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage1(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-售后状态-待退货 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage2(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-售后状态-待收货验货 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage3(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-售后状态-待退款审核 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage4(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-售后状态-待退款 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage5(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-售后状态-已完成 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p6",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage6(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-售后状态-已取消 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p7",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage7(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-订单号 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p8",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage8(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-售后单号 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p9",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage9(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-备注 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p10",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage10(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-售后类型-仅退款 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p11",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage11(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-售后类型-退货退款 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p12",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage12(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取售后单分页-组合查询 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "getOrderAfterByPage-p13",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage13(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

//    @Test(description = "获取售后单-测试 getOrderAfterByPage" ,groups = ["uat"],testName = "getOrderAfterByPage-test",
//            dataProvider = "dataProvider",dataProviderClass = TestData.class)
//    public void getOrderAfterByPageTest(TestContext testContext){
//        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
//    }
}
