package com.credika.test.http.scrm.shop

import com.credika.biz.request.http.scrm.shop.ShopList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-16:29
 */
class ShopListTest extends BaseTest {
    ShopList shop = new ShopList()

    @Test(description = "门店列表", groups = ["prod", "uat"], testName = "shopslist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        shop.invoke(testContext).baseAssert(testContext)
    }
}
