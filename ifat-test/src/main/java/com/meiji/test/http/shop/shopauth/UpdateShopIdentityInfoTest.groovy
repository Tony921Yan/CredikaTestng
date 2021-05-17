package com.meiji.test.http.shop.shopauth

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.shopauth.UpdateShopCompanyInfo
import com.meiji.request.http.shop.shopauth.UpdateShopIdentityInfo
import org.testng.annotations.Test

class UpdateShopIdentityInfoTest extends BaseTest {
    UpdateShopIdentityInfo updateShopIdentityInfo = new UpdateShopIdentityInfo()
    @Test(description = "更新店铺经营信息-身份信息 updateShopIdentityInfo" ,groups = ["prod","uat"],testName = "updateShopIdentityInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopIdentityInfo(TestContext testContext){
        updateShopIdentityInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
