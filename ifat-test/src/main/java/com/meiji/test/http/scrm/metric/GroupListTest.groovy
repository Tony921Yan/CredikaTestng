package com.meiji.test.http.scrm.metric

import com.meiji.biz.request.http.scrm.metric.GroupList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:59
 */
class GroupListTest extends BaseTest {
    GroupList list = new GroupList()

    @Test(description = "按群统计", groups = ["prod", "uat"], testName = "groupslist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        list.invoke(testContext).baseAssert(testContext)
    }
}
