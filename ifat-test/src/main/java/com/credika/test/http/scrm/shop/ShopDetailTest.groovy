package com.credika.test.http.scrm.shop

import com.credika.biz.request.http.scrm.shop.ShopDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-16:25
 */
class ShopDetailTest extends BaseTest {
    ShopDetail shop = new ShopDetail()

    @Test(description = "门店详情", groups = ["prod", "uat"], testName = "shopdetail",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        shop.invoke(testContext).baseAssert(testContext)
    }
}
