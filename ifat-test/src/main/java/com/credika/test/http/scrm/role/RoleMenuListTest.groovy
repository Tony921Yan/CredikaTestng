package com.credika.test.http.scrm.role

import com.credika.biz.request.http.scrm.role.RoleMenuList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-15:45
 */
class RoleMenuListTest extends BaseTest {
    RoleMenuList roleMenuList = new RoleMenuList()
    @Test(description = "角色菜单列表 rolemenulist", groups = ["prod", "uat"], testName = "rolemenulist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        roleMenuList.invoke(testContext).baseAssert(testContext)
    }
}
