package com.credika.test.http.shop.shopauth

import com.credika.biz.request.http.shop.shopauth.UpdateShopBankAccountInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateShopBankAccountInfoTest extends BaseTest {
    UpdateShopBankAccountInfo updateShopBankAccountInfo = new UpdateShopBankAccountInfo()
    @Test(description = "更新店铺经营信息-结算银行账户 updateShopBankAccountInfo" ,groups = ["prod","uat"],testName = "updateShopBankAccountInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopBankAccountInfo(TestContext testContext){
        updateShopBankAccountInfo.invoke(testContext).baseAssert(testContext)
    }
}
