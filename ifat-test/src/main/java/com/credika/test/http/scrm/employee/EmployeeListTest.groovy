package com.credika.test.http.scrm.employee

import com.credika.biz.request.http.scrm.employee.EmployeeList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-15:13
 */
class EmployeeListTest extends BaseTest {
    EmployeeList employeeList = new EmployeeList()
    @Test(description = "查看成员信息", groups = ["prod", "uat"], testName = "employeeList",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        employeeList.invoke(testContext).baseAssert(testContext)
    }
}
