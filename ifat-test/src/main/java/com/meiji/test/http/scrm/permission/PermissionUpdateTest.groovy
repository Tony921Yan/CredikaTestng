package com.meiji.test.http.scrm.permission

import com.meiji.biz.request.http.scrm.permission.PermissionUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-15:46
 */
class PermissionUpdateTest extends BaseTest {
    PermissionUpdate permission = new PermissionUpdate()

    @Test(description = "修改权限", groups = ["prod", "uat"], testName = "perupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        permission.invoke(testContext).baseAssert(testContext)
    }
}
