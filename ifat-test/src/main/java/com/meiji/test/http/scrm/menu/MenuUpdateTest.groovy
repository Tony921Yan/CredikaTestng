package com.meiji.test.http.scrm.menu

import com.meiji.biz.request.http.scrm.menu.MenuUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-15:36
 */
class MenuUpdateTest extends BaseTest {
    MenuUpdate menu = new MenuUpdate()

    @Test(description = "修改菜单", groups = ["prod", "uat"], testName = "menuupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        menu.invoke(testContext).baseAssert(testContext)
    }
}
