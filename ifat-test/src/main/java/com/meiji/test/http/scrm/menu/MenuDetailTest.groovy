package com.meiji.test.http.scrm.menu

import com.meiji.biz.request.http.scrm.menu.MenuDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-15:30
 */
class MenuDetailTest extends BaseTest {

    MenuDetail menuDetail = new MenuDetail()

    @Test(description = "菜单详情 menudetail" ,groups = ["prod","uat"],testName = "menutail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        menuDetail.invoke(testContext).baseAssert(testContext)
    }
}
