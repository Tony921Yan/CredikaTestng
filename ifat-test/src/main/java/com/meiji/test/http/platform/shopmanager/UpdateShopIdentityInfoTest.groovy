package com.meiji.test.http.platform.shopmanager


import com.meiji.biz.request.http.platform.shopmanager.UpdateShopCompanyInfo
import com.meiji.biz.request.http.platform.shopmanager.UpdateShopIdentityInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateShopIdentityInfoTest extends BaseTest {
    UpdateShopIdentityInfo updateShopIdentityInfo = new UpdateShopIdentityInfo()
    @Test(description = "更新店铺经营信息-身份信息 updateShopIdentityInfo" ,groups = ["prod","uat"],testName = "updateShopIdentityInfo1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopIdentityInfo(TestContext testContext){
        updateShopIdentityInfo.invoke(testContext).baseAssert(testContext)
    }
}
