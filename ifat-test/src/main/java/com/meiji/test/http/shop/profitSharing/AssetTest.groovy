package com.meiji.test.http.shop.profitSharing

import com.meiji.biz.request.http.shop.profitSharing.Asset
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AssetTest extends BaseTest {
    Asset asset = new Asset()
    @Test(description = "卖家待分账金额 asset" ,groups = ["prod","uat"],testName = "asset",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void asset(TestContext testContext){
        asset.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

}
