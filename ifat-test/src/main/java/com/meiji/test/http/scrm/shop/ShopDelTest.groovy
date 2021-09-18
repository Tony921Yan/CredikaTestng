package com.meiji.test.http.scrm.shop

import com.meiji.biz.request.http.scrm.shop.ShopDel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-16:23
 */
class ShopDelTest extends BaseTest {
    ShopDel shop = new ShopDel()

    @Test(description = "删除门店", groups = ["prod", "uat"], testName = "shopdel",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        shop.invoke(testContext).baseAssert(testContext)
    }
}
