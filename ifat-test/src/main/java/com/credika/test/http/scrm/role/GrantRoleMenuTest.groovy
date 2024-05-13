package com.credika.test.http.scrm.role

import com.credika.biz.request.http.scrm.role.GrantRoleMenu
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-16:00
 */
class GrantRoleMenuTest extends BaseTest {
    GrantRoleMenu role = new GrantRoleMenu()

    @Test(description = "角色菜单授权", groups = ["prod", "uat"], testName = "grantrolemenu",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        role.invoke(testContext).baseAssert(testContext)
    }
}
