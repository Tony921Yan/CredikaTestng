package com.credika.test.http.platform.other

import com.credika.biz.request.http.platform.other.SearchContentBonus
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/12 22：30
 @version v2.3
 */
class SearchContentBonusTest extends BaseTest {
    SearchContentBonus searchContentBonus = new SearchContentBonus();
    @Test(description = "晒单有奖列表 searchContentBonus" ,groups = ["prod","uat"],testName = "searchContentBonus",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchContentBonus(TestContext testContext){
        searchContentBonus.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "晒单有奖-待提交 searchContentBonus" ,groups = ["prod","uat"],testName = "searchContentBonus1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchContentBonus1(TestContext testContext){
        searchContentBonus.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "晒单有奖-待发布 searchContentBonus" ,groups = ["prod","uat"],testName = "searchContentBonus2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchContentBonus2(TestContext testContext){
        searchContentBonus.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "晒单有奖-未开始 searchContentBonus" ,groups = ["prod","uat"],testName = "searchContentBonus3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchContentBonus3(TestContext testContext){
        searchContentBonus.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "晒单有奖-进行中 searchContentBonus" ,groups = ["prod","uat"],testName = "searchContentBonus4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchContentBonus4(TestContext testContext){
        searchContentBonus.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "晒单有奖-已结束 searchContentBonus" ,groups = ["prod","uat"],testName = "searchContentBonus5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchContentBonus5(TestContext testContext){
        searchContentBonus.invoke(testContext).baseAssert(testContext)
    }

}
