package com.meiji.test.http.scrm.menu

import com.meiji.biz.request.http.scrm.menu.MenuAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-15:20
 */
class MenuAddTest extends BaseTest {
    MenuAdd menu = new MenuAdd()

    @Test(description = "新增菜单", groups = ["prod", "uat"], testName = "menuadd",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        menu.invoke(testContext).baseAssert(testContext)
    }
}
