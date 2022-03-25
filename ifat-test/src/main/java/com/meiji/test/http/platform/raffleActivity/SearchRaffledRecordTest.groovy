package com.meiji.test.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.raffleActivity.SearchRaffledRecord
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchRaffledRecordTest extends BaseTest {
    SearchRaffledRecord searchRaffledRecord = new SearchRaffledRecord()
    @Test(description = "中奖记录 searchRaffledRecord" ,groups = ["prod","uat"],testName = "searchRaffledRecord",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchRaffledRecord(TestContext testContext){
        searchRaffledRecord.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}