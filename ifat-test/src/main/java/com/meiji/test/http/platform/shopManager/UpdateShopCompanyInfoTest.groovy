package com.meiji.test.http.platform.shopManager


import com.meiji.biz.request.http.platform.shopmanager.UpdateShopCompanyInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateShopCompanyInfoTest extends BaseTest {//shop库中的表shop_company_info
    UpdateShopCompanyInfo updateShopCompanyInfo = new UpdateShopCompanyInfo()
    @Test(description = "更新店铺企业信息 updateShopCompanyInfo" ,groups = ["prod","uat"],testName = "updateShopCompanyInfo1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopCompanyInfo(TestContext testContext){
        updateShopCompanyInfo.invoke(testContext).baseAssert(testContext)
    }
}
