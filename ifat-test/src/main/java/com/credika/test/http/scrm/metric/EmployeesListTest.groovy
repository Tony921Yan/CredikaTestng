package com.credika.test.http.scrm.metric

import com.credika.biz.request.http.scrm.metric.EmployeesList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:52
 */
class EmployeesListTest extends BaseTest {
    EmployeesList emp = new EmployeesList()

    @Test(description = "按员工统计", groups = ["prod", "uat"], testName = "empslist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        emp.invoke(testContext).baseAssert(testContext)
    }
}
