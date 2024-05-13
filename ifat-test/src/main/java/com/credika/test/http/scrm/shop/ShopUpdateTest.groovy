package com.credika.test.http.scrm.shop

import com.credika.biz.request.http.scrm.shop.ShopUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-16:38
 */
class ShopUpdateTest extends BaseTest {
    ShopUpdate shop = new ShopUpdate()

    @Test(description = "编辑门店", groups = ["prod", "uat"], testName = "shopupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        shop.invoke(testContext).baseAssert(testContext)
    }
}
