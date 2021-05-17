package com.meiji.test.http.shop


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AssetTest extends BaseTest {
    com.meiji.biz.request.http.shop.Asset asset = new com.meiji.biz.request.http.shop.Asset()
    @Test(description = "卖家待分账金额 asset" ,groups = ["prod","uat"],testName = "asset",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void asset(TestContext testContext){
        asset.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

}
