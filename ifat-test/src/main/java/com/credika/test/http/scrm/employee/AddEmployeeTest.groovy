package com.credika.test.http.scrm.employee

import com.credika.biz.request.http.scrm.employee.AddEmployee
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/13-10:58
 */
class AddEmployeeTest extends BaseTest {
    AddEmployee employee = new AddEmployee()

    @Test(description = "创建成员角色", groups = ["prod", "uat"], testName = "AddEmployee",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        employee.invoke(testContext).baseAssert(testContext)
    }
}
