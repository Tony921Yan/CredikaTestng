package com.meiji.test.http.shop.shopauth

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.shopauth.FindShopCompanyInfo
import com.meiji.request.http.shop.shopauth.UpdateShopBankAccountInfo
import org.testng.annotations.Test

class UpdateShopBankAccountInfoTest extends BaseTest {
    UpdateShopBankAccountInfo updateShopBankAccountInfo = new UpdateShopBankAccountInfo()
    @Test(description = "更新店铺经营信息-结算银行账户 updateShopBankAccountInfo" ,groups = ["prod","uat"],testName = "updateShopBankAccountInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopBankAccountInfo(TestContext testContext){
        updateShopBankAccountInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
