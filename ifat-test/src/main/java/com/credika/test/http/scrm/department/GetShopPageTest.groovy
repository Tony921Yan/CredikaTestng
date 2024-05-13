package com.credika.test.http.scrm.department

import com.credika.biz.request.http.scrm.department.GetShopPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:00
 */
class GetShopPageTest extends BaseTest {
    GetShopPage page = new GetShopPage()

    @Test(description = "获取门店列表(分页)", groups = ["prod", "uat"], testName = "deppage",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        page.invoke(testContext).baseAssert(testContext)
    }
}
