package com.credika.test.http.scrm.employee

import com.credika.biz.request.http.scrm.employee.EmployeeUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-10:19
 */
class EmployeeUpdateTest extends BaseTest {
    EmployeeUpdate employeeUpdate = new EmployeeUpdate()

    @Test(description = "修改成员角色", groups = ["prod", "uat"], testName = "empupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        employeeUpdate.invoke(testContext).baseAssert(testContext)
    }
}
