package com.meiji.test.http.OMS.aftersale

import com.meiji.biz.request.http.OMS.aftersale.GetOrderAfterByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetOrderAfterByPageTest extends BaseTest {
   GetOrderAfterByPage getOrderAfterByPage = new GetOrderAfterByPage()
    @Test(description = "获取售后单分页 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取售后单分页-待审核 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterByPage1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage1(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取售后单分页-待退货 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterByPage2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage2(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取售后单分页-待收货验货 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterByPage3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage3(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取售后单分页-待退款审核 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterByPage4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage4(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取售后单分页-待退款 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterByPage5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage5(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取售后单分页-已完成 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterByPage6",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage6(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取售后单分页-已取消 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterByPage7",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage7(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取售后单分页-筛选仅退款 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterByPage8",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage8(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取售后单分页-筛选退货退款 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterByPage9",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage9(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "获取售后单分页-精确搜索 getOrderAfterByPage" ,groups = ["prod","uat"],testName = "OMSgetOrderAfterByPage10",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderAfterByPage10(TestContext testContext){
        getOrderAfterByPage.invoke(testContext).baseAssert(testContext)
    }
}
