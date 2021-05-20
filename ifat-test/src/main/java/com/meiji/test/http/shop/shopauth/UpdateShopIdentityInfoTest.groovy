package com.meiji.test.http.shop.shopauth

import com.meiji.biz.request.http.shop.shopauth.UpdateShopIdentityInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateShopIdentityInfoTest extends BaseTest {
    UpdateShopIdentityInfo updateShopIdentityInfo = new UpdateShopIdentityInfo()
    @Test(description = "更新店铺经营信息-身份信息 updateShopIdentityInfo" ,groups = ["prod","uat"],testName = "updateShopIdentityInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopIdentityInfo(TestContext testContext){
        updateShopIdentityInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
