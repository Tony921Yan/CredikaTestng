package com.meiji.test.http.scrm.metric

import com.meiji.biz.request.http.scrm.metric.GetTrendList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:56
 */
class GetTrendListTest extends BaseTest {
    GetTrendList list = new GetTrendList()

    @Test(description = "群数据趋势", groups = ["prod", "uat"], testName = "trendlist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        list.invoke(testContext).baseAssert(testContext)
    }
}
