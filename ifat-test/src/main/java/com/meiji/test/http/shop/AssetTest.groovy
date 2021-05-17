package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.Asset
import org.testng.annotations.Test

class AssetTest extends BaseTest {
    Asset asset = new Asset()
    @Test(description = "卖家待分账金额 asset" ,groups = ["prod","uat"],testName = "asset",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void asset(TestContext testContext){
        asset.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

}
