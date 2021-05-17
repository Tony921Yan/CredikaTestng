package com.meiji.test.http.shop.shopauth

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.shopauth.UpdateShopIdentityInfo
import com.meiji.request.http.shop.shopauth.UpdateShopInfo
import org.testng.annotations.Test

class UpdateShopInfoTest extends BaseTest {
    UpdateShopInfo updateShopInfo = new UpdateShopInfo()
    @Test(description = "更新店铺信息 updateShopInfo" ,groups = ["prod","uat"],testName = "updateShopInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopInfo(TestContext testContext){
        updateShopInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
