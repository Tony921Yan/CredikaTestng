package com.credika.test.http.scrm.group

import com.credika.biz.request.http.scrm.group.GetEmployeeGroup
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-17:24
 */
class GetEmployeeGroupTest extends BaseTest {
    GetEmployeeGroup getEmployeeGroup = new GetEmployeeGroup()

    @Test(description = "获取员工下的群列表", groups = ["prod", "uat"], testName = "getempgroup",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        getEmployeeGroup.invoke(testContext).baseAssert(testContext)
    }
}
