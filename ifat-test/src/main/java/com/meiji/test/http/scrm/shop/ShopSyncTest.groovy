package com.meiji.test.http.scrm.shop

import com.meiji.biz.request.http.scrm.shop.ShopSync
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-16:36
 */
class ShopSyncTest extends BaseTest {
    ShopSync shop = new ShopSync()

    @Test(description = "批量同步门店数据", groups = ["prod", "uat"], testName = "shopsync",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        shop.invoke(testContext).baseAssert(testContext)
    }
}
