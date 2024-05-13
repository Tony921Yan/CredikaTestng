package com.credika.test.http.platform.other

import com.credika.biz.request.http.platform.other.SearchCpsContentBonus
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchCpsContentBonusTest extends BaseTest {
    SearchCpsContentBonus searchCpsContentBonus = new SearchCpsContentBonus()
    @Test(description = "晒单CPS-全部 searchCpsContentBonus" ,groups = ["prod","uat"],testName = "searchCpsContentBonus",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchCpsContentBonus(TestContext testContext){
        searchCpsContentBonus.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "晒单CPS-待提交 searchCpsContentBonus" ,groups = ["prod","uat"],testName = "searchCpsContentBonus1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchCpsContentBonus1(TestContext testContext){
        searchCpsContentBonus.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "晒单CPS-待发布 searchCpsContentBonus" ,groups = ["prod","uat"],testName = "searchCpsContentBonus2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchCpsContentBonus2(TestContext testContext){
        searchCpsContentBonus.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "晒单CPS-未开始 searchCpsContentBonus" ,groups = ["prod","uat"],testName = "searchCpsContentBonus3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchCpsContentBonus3(TestContext testContext){
        searchCpsContentBonus.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "晒单CPS-进行中 searchCpsContentBonus" ,groups = ["prod","uat"],testName = "searchCpsContentBonus4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchCpsContentBonus4(TestContext testContext){
        searchCpsContentBonus.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "晒单CPS-已结束 searchCpsContentBonus" ,groups = ["prod","uat"],testName = "searchCpsContentBonus5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchCpsContentBonus5(TestContext testContext){
        searchCpsContentBonus.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "晒单CPS-已取消 searchCpsContentBonus" ,groups = ["prod","uat"],testName = "searchCpsContentBonus6",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchCpsContentBonus6(TestContext testContext){
        searchCpsContentBonus.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "晒单CPS-所有条件搜索 searchCpsContentBonus" ,groups = ["prod","uat"],testName = "searchCpsContentBonus7",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchCpsContentBonus7(TestContext testContext){
        searchCpsContentBonus.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
