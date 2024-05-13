package com.credika.test.http.scrm.department

import com.credika.biz.request.http.scrm.department.DepartmentUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:08
 */
class DepartmentUpdateTest extends BaseTest {
    DepartmentUpdate dep = new DepartmentUpdate()

    @Test(description = "修改组织", groups = ["prod", "uat"], testName = "depupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        dep.invoke(testContext).baseAssert(testContext)
    }
}
