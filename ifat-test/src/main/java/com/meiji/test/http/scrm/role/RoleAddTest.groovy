package com.meiji.test.http.scrm.role

import com.meiji.biz.request.http.scrm.role.RoleAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-15:45
 */
class RoleAddTest extends BaseTest {
    RoleAdd role = new RoleAdd()

    @Test(description = "新增角色", groups = ["prod", "uat"], testName = "roleadd",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        role.invoke(testContext).baseAssert(testContext)
    }
}
