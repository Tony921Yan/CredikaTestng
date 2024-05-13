package com.credika.test.http.platform.raffleActivity
import com.credika.biz.request.http.platform.raffleActivity.SearchRaffledRecord
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

//    @Test(description = "中奖记录-用户行为:普通抽奖 searchRaffledRecord01" ,groups = ["prod","uat"],testName = "searchRaffledRecord01",
//            dataProvider = "dataProvider",dataProviderClass = TestData.class)
//    public void searchRaffledRecord01(TestContext testContext){
//        searchRaffledRecord.invoke(testContext).baseAssert(testContext)
//    }
//
//    @Test(description = "中奖记录-用户行为:送礼抽奖 searchRaffledRecord02" ,groups = ["prod","uat"],testName = "searchRaffledRecord02",
//            dataProvider = "dataProvider",dataProviderClass = TestData.class)
//    public void searchRaffledRecord02(TestContext testContext){
//        searchRaffledRecord.invoke(testContext).baseAssert(testContext)
//    }
//
//    @Test(description = "中奖记录-用户行为:积分抽奖 searchRaffledRecord03" ,groups = ["prod","uat"],testName = "searchRaffledRecord03",
//            dataProvider = "dataProvider",dataProviderClass = TestData.class)
//    public void searchRaffledRecord03(TestContext testContext){
//        searchRaffledRecord.invoke(testContext).baseAssert(testContext)
//    }

}