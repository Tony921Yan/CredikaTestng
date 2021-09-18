package com.meiji.test.http.scrm.menu

import com.meiji.biz.request.http.scrm.menu.MenuDel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-15:27
 */
class MenuDelTest extends BaseTest {
    MenuDel menu = new MenuDel()

    @Test(description = "删除菜单", groups = ["prod", "uat"], testName = "menudel",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        menu.invoke(testContext).baseAssert(testContext)
    }
}
