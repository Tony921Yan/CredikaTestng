package com.credika.test.http.scrm.group

import com.credika.biz.request.http.scrm.group.GetShopGroup
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-14:13
 */
class GetShopGroupTest extends BaseTest {
    GetShopGroup group = new GetShopGroup()

    @Test(description = "获取门店下的群列表", groups = ["prod", "uat"], testName = "getshopgroup",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        group.invoke(testContext).baseAssert(testContext)
    }
}
