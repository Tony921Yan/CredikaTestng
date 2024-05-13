package com.credika.test.http.scrm.department

import com.credika.biz.request.http.scrm.department.DepartmentDel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-13:54
 */
class DepartmentDelTest extends BaseTest {
    DepartmentDel del = new DepartmentDel()

    @Test(description = "删除组织", groups = ["prod", "uat"], testName = "depdel",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        del.invoke(testContext).baseAssert(testContext)
    }
}
