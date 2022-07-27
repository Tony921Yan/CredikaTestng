package com.meiji.test.http.OMS.contract

import com.meiji.biz.request.http.OMS.contract.QueryPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryPageTest extends BaseTest{
    QueryPage queryPage = new QueryPage()
    @Test(description = "合同管理 queryPage" ,groups = ["prod","uat"],testName = "contractQueryPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryPage(TestContext testContext){
        queryPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "合同管理-待提交 queryPage" ,groups = ["prod","uat"],testName = "contractQueryPage1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryPage1(TestContext testContext){
        queryPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "合同管理-待供应商盖章 queryPage" ,groups = ["prod","uat"],testName = "contractQueryPage2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryPage2(TestContext testContext){
        queryPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "合同管理-待美记盖章 queryPage" ,groups = ["prod","uat"],testName = "contractQueryPage3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryPage3(TestContext testContext){
        queryPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "合同管理-生效中 queryPage" ,groups = ["prod","uat"],testName = "contractQueryPage4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryPage4(TestContext testContext){
        queryPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "合同管理-已到期 queryPage" ,groups = ["prod","uat"],testName = "contractQueryPage5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryPage5(TestContext testContext){
        queryPage.invoke(testContext).baseAssert(testContext)
    }
}
