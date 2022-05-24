package com.meiji.test.http.platform.applicationList

import com.meiji.biz.request.http.platform.applicationList.GetCompensationListByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCompensationListByPageTest extends BaseTest {
    GetCompensationListByPage getCompensationListByPage = new GetCompensationListByPage()
    @Test(description = "获取买贵必赔数据列表-默认-全部 getCompensationListByPage" ,groups = ["prod","uat"],testName = "getCompensationListByPage-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationListByPage(TestContext testContext){
        getCompensationListByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取买贵必赔数据列表-审核状态-待审核 getCompensationListByPage" ,groups = ["prod","uat"],testName = "getCompensationListByPage-p1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationListByPage1(TestContext testContext){
        getCompensationListByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取买贵必赔数据列表-审核状态-审核通过 getCompensationListByPage" ,groups = ["prod","uat"],testName = "getCompensationListByPage-p2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationListByPage2(TestContext testContext){
        getCompensationListByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取买贵必赔数据列表-审核状态-审核通过 getCompensationListByPage" ,groups = ["prod","uat"],testName = "getCompensationListByPage-p3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationListByPage3(TestContext testContext){
        getCompensationListByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取买贵必赔数据列表-用户id getCompensationListByPage" ,groups = ["prod","uat"],testName = "getCompensationListByPage-p4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationListByPage4(TestContext testContext){
        getCompensationListByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取买贵必赔数据列表-用户手机 getCompensationListByPage" ,groups = ["prod","uat"],testName = "getCompensationListByPage-p5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationListByPage5(TestContext testContext){
        getCompensationListByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取买贵必赔数据列表-用户昵称 getCompensationListByPage" ,groups = ["prod","uat"],testName = "getCompensationListByPage-p6",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationListByPage6(TestContext testContext){
        getCompensationListByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取买贵必赔数据列表-sku编码 getCompensationListByPage" ,groups = ["prod","uat"],testName = "getCompensationListByPage-p7",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationListByPage7(TestContext testContext){
        getCompensationListByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取买贵必赔数据列表-店铺名称 getCompensationListByPage" ,groups = ["prod","uat"],testName = "getCompensationListByPage-p8",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationListByPage8(TestContext testContext){
        getCompensationListByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取买贵必赔数据列表-订单编号 getCompensationListByPage" ,groups = ["prod","uat"],testName = "getCompensationListByPage-p9",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationListByPage9(TestContext testContext){
        getCompensationListByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "获取买贵必赔数据列表-申请时间 getCompensationListByPage" ,groups = ["prod","uat"],testName = "getCompensationListByPage-p10",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCompensationListByPage10(TestContext testContext){
        getCompensationListByPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }



}
