package com.credika.test.http.scrm.employee

import com.credika.biz.request.http.scrm.employee.EmployeeDepartmentList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-15:05
 */
class EmployeeDepartmentListTest extends BaseTest {
    EmployeeDepartmentList employeeDepartmentList = new EmployeeDepartmentList()

    @Test(description = "获取员工企微部门列表", groups = ["prod", "uat"], testName = "employeeDepartmentList",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        employeeDepartmentList.invoke(testContext).baseAssert(testContext)
    }
}
