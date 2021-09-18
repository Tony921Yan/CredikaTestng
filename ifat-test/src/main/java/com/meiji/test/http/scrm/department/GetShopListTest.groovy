package com.meiji.test.http.scrm.department

import com.meiji.biz.request.http.scrm.department.GetShopList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-13:57
 */
class GetShopListTest extends BaseTest {
    GetShopList shop = new GetShopList()

    @Test(description = "获取门店列表", groups = ["prod", "uat"], testName = "depgetshoplist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        shop.invoke(testContext).baseAssert(testContext)
    }
}
