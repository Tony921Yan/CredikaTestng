package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.AssetsManagement
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AssetsManagementTest extends BaseTest {
    AssetsManagement assetsManagement = new AssetsManagement()
    @Test(description = "获取商品素材列表 assetsManagement", groups = ["prod", "uat"], testName = "assetsManagement",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void assetsManagement(TestContext testContext) {
        assetsManagement.invoke(testContext).baseAssert(testContext)
        assetsManagement.specialAssert(testContext)
    }
}