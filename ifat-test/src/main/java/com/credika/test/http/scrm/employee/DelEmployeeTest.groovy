package com.credika.test.http.scrm.employee

import com.credika.biz.request.http.scrm.employee.DelEmployee
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/13-11:33
 */
class DelEmployeeTest extends BaseTest {
    DelEmployee employee = new DelEmployee()

    @Test(description = "删除成员", groups = ["prod", "uat"], testName = "delemployee",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        employee.invoke(testContext).baseAssert(testContext)
    }
}
