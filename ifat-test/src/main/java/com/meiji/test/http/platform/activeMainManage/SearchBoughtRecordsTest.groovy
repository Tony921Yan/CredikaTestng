package com.meiji.test.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.activeMainManage.SearchBoughtRecords
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchBoughtRecordsTest extends BaseTest {
    SearchBoughtRecords searchBoughtRecords = new SearchBoughtRecords()
    @Test(description = "活动管理-购买记录 searchBoughtRecords" ,groups = ["prod","uat"],testName = "searchBoughtRecords",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchBoughtRecords(TestContext testContext){
        searchBoughtRecords.invoke(testContext).baseAssert(testContext)
    }

}