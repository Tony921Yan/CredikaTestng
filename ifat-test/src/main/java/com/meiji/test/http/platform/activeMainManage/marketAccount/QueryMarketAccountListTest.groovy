package com.meiji.test.http.platform.activeMainManage.marketAccount

import com.meiji.biz.request.http.platform.activeMainManage.marketAccount.QueryMarketAccountList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class QueryMarketAccountListTest extends BaseTest {
    QueryMarketAccountList queryMarketAccountList = new QueryMarketAccountList()
    @Test(description = "查询营销账户 queryMarketAccountList" ,groups = ["prod","uat"],testName = "queryMarketAccountList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryMarketAccountList(TestContext testContext){
        queryMarketAccountList.invoke(testContext).baseAssert(testContext)
    }

}