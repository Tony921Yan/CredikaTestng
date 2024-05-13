package com.credika.test.http.scrm.group

import com.credika.biz.request.http.scrm.group.GetGroupShow
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-17:39
 */
class GetGroupShowTest extends BaseTest {
    GetGroupShow getGroupShow = new GetGroupShow();
    @Test(description = "获取群详情", groups = ["prod", "uat"], testName = "getgroups",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        getGroupShow.invoke(testContext).baseAssert(testContext)
    }
}
