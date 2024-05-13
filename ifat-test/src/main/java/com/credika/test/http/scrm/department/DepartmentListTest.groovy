package com.credika.test.http.scrm.department

import com.credika.biz.request.http.scrm.department.DepartmentList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-17:00
 */
class DepartmentListTest extends BaseTest {
    DepartmentList departmentList = new DepartmentList()

    @Test(description = "组织列表", groups = ["prod", "uat"], testName = "departlist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        departmentList.invoke(testContext).baseAssert(testContext)
    }
}
