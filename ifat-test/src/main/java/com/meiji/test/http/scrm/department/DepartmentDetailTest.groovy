package com.meiji.test.http.scrm.department

import com.meiji.biz.request.http.scrm.department.DepartmentDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-16:57
 */
class DepartmentDetailTest extends BaseTest {
    DepartmentDetail departmentDetail = new DepartmentDetail()

    @Test(description = "组织详情", groups = ["prod", "uat"], testName = "departdetail",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        departmentDetail.invoke(testContext).baseAssert(testContext)
    }
}
