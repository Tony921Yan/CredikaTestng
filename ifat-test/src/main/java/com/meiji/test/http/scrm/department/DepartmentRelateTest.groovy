package com.meiji.test.http.scrm.department

import com.meiji.biz.request.http.scrm.department.DepartmentRelate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:04
 */
class DepartmentRelateTest extends BaseTest {
    DepartmentRelate dep = new DepartmentRelate()

    @Test(description = "新建门店--组织门店关联", groups = ["prod", "uat"], testName = "deprelate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        dep.invoke(testContext).baseAssert(testContext)
    }
}
