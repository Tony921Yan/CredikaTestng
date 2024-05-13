package com.credika.test.http.scrm.employee

import com.credika.biz.request.http.scrm.employee.EmployeeConfig
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/13-11:37
 */
class EmployeeConfigTest extends BaseTest {
    EmployeeConfig employee = new EmployeeConfig()

    @Test(description = "配置成员", groups = ["prod", "uat"], testName = "empConfig",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        employee.invoke(testContext).baseAssert(testContext)
    }
}
