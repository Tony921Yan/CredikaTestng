package com.meiji.test.http.scrm.role

import com.meiji.biz.request.http.scrm.role.UpdateGrantRoleMenu
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-16:19
 */
class UpdateGrantRoleMenuTest extends BaseTest {
    UpdateGrantRoleMenu menu = new UpdateGrantRoleMenu()

    @Test(description = "更新角色菜单授权", groups = ["prod", "uat"], testName = "updatemenu",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        menu.invoke(testContext).baseAssert(testContext)
    }
}
