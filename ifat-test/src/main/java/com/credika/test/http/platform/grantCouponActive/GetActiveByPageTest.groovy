package com.credika.test.http.platform.grantCouponActive
import com.credika.biz.request.http.platform.grantCouponActive.GetActiveByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetActiveByPageTest extends BaseTest {
    GetActiveByPage getActiveByPage = new GetActiveByPage()
    @Test(description = "获取活动数据 getActiveByPage" ,groups = ["prod","uat"],testName = "getActiveByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActiveByPage(TestContext testContext){
        getActiveByPage.invoke(testContext).baseAssert(testContext)
    }

    GetActiveByPage getActiveByPage1 = new GetActiveByPage()
    @Test(description = "获取活动数据-待提交 getActiveByPage1",groups = ["prod","uat"],testName = "getActiveByPage1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActiveByPage1(TestContext testContext){
        getActiveByPage1.invoke(testContext).baseAssert(testContext)
    }

    GetActiveByPage getActiveByPage2 = new GetActiveByPage()
    @Test(description = "获取活动数据-待发布 getActiveByPage2",groups = ["prod","uat"],testName = "getActiveByPage2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActiveByPage2(TestContext testContext){
        getActiveByPage2.invoke(testContext).baseAssert(testContext)
    }

    GetActiveByPage getActiveByPage3 = new GetActiveByPage()
    @Test(description = "获取活动数据-未开始 getActiveByPage3",groups = ["prod","uat"],testName = "getActiveByPage3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActiveByPage3(TestContext testContext){
        getActiveByPage3.invoke(testContext).baseAssert(testContext)
    }

    GetActiveByPage getActiveByPage4 = new GetActiveByPage()
    @Test(description = "获取活动数据-进行中 getActiveByPage4",groups = ["prod","uat"],testName = "getActiveByPage4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActiveByPage4(TestContext testContext){
        getActiveByPage4.invoke(testContext).baseAssert(testContext)
    }

    GetActiveByPage getActiveByPage5 = new GetActiveByPage()
    @Test(description = "获取活动数据-已结束 getActiveByPage5",groups = ["prod","uat"],testName = "getActiveByPage5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActiveByPage5(TestContext testContext){
        getActiveByPage5.invoke(testContext).baseAssert(testContext)
    }

    GetActiveByPage getActiveByPage6 = new GetActiveByPage()
    @Test(description = "获取活动数据-已取消 getActiveByPage6",groups = ["prod","uat"],testName = "getActiveByPage6",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getActiveByPage6(TestContext testContext){
        getActiveByPage6.invoke(testContext).baseAssert(testContext)
    }
}
