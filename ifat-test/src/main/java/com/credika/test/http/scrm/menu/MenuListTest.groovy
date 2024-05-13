package com.credika.test.http.scrm.menu

import com.credika.biz.request.http.scrm.menu.MenuList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-14:41
 */
class MenuListTest extends BaseTest {

    MenuList menuList = new MenuList()
    @Test(description = "菜单列表 menulist" ,groups = ["prod","uat"],testName = "menulist",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        menuList.invoke(testContext).baseAssert(testContext)
    }




}
