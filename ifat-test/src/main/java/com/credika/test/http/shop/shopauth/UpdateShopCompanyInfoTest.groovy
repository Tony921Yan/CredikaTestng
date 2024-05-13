package com.credika.test.http.shop.shopauth

import com.credika.biz.request.http.shop.shopauth.UpdateShopCompanyInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateShopCompanyInfoTest extends BaseTest {
    UpdateShopCompanyInfo updateShopCompanyInfo = new UpdateShopCompanyInfo()
    @Test(description = "更新店铺企业信息 updateShopCompanyInfo" ,groups = ["prod","uat"],testName = "updateShopCompanyInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopCompanyInfo(TestContext testContext){
        updateShopCompanyInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
