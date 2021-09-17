package com.meiji.test.http.scrm.permission

import com.meiji.biz.request.http.scrm.permission.PermissionAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-15:18
 */
class PermissionAddTest extends BaseTest {
    PermissionAdd permission = new PermissionAdd()

    @Test(description = "新增权限", groups = ["prod", "uat"], testName = "permissionadd",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        permission.invoke(testContext).baseAssert(testContext)
    }
}
