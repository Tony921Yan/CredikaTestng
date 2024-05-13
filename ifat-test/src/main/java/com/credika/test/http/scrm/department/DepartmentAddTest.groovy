package com.credika.test.http.scrm.department

import com.credika.biz.request.http.scrm.department.DepartmentAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-13:50
 */
class DepartmentAddTest extends BaseTest {
    DepartmentAdd department = new DepartmentAdd()

    @Test(description = "新增组织", groups = ["prod", "uat"], testName = "departmentadd",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        department.invoke(testContext).baseAssert(testContext)
    }
}
