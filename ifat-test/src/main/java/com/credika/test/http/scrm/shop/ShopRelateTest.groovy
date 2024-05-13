package com.credika.test.http.scrm.shop

import com.credika.biz.request.http.scrm.shop.ShopRelate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-16:33
 */
class ShopRelateTest extends BaseTest {
    ShopRelate shop = new ShopRelate()

    @Test(description = "门店员工群关联", groups = ["prod", "uat"], testName = "shoprelate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        shop.invoke(testContext).baseAssert(testContext)
    }
}
