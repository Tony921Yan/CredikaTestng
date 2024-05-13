package com.credika.test.http.platform.activeMainManage

import com.credika.biz.request.http.platform.activeMainManage.SearchActivityRecords
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchActivityRecordsTest extends BaseTest {
    SearchActivityRecords searchActivityRecords = new SearchActivityRecords()
    @Test(description = "活动管理-活动记录 searchActivityRecords" ,groups = ["prod","uat"],testName = "searchActivityRecords",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchActivityRecords(TestContext testContext){
        searchActivityRecords.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动管理-活动记录-秒杀活动 searchActivityRecords" ,groups = ["prod","uat"],testName = "searchActivityRecords1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchActivityRecords1(TestContext testContext){
        searchActivityRecords.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动管理-活动记录-拼团活动 searchActivityRecords" ,groups = ["prod","uat"],testName = "searchActivityRecords2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchActivityRecords2(TestContext testContext){
        searchActivityRecords.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "活动管理-活动记录-拼团活动精确搜索 searchActivityRecords" ,groups = ["prod","uat"],testName = "searchActivityRecords3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchActivityRecords3(TestContext testContext){
        searchActivityRecords.invoke(testContext).baseAssert(testContext)
    }
}