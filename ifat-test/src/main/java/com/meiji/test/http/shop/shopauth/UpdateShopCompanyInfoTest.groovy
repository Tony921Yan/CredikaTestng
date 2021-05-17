package com.meiji.test.http.shop.shopauth

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.shopauth.UpdateShopBankAccountInfo
import com.meiji.request.http.shop.shopauth.UpdateShopCompanyInfo
import org.testng.annotations.Test

class UpdateShopCompanyInfoTest extends BaseTest {
    UpdateShopCompanyInfo updateShopCompanyInfo = new UpdateShopCompanyInfo()
    @Test(description = "更新店铺企业信息 updateShopCompanyInfo" ,groups = ["prod","uat"],testName = "updateShopCompanyInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopCompanyInfo(TestContext testContext){
        updateShopCompanyInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
