package com.meiji.test.http.scrm.metric

import com.meiji.biz.request.http.scrm.metric.DayList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:44
 */
class DayListTest extends BaseTest {
    DayList list = new DayList()

    @Test(description = "按天统计", groups = ["prod", "uat"], testName = "daylist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        list.invoke(testContext).baseAssert(testContext)
    }

}
