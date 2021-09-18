package com.meiji.test.http.scrm.metric

import com.meiji.biz.request.http.scrm.metric.Statistical
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-15:03
 */
class StatisticalTest extends BaseTest {
    Statistical statistical = new Statistical()

    @Test(description = "群数据统计", groups = ["prod", "uat"], testName = "statistical",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        statistical.invoke(testContext).baseAssert(testContext)
    }
}
