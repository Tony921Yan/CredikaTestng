package com.meiji.test.http.shop.shopauth

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.shopauth.FindShopBusinessInfo
import com.meiji.request.http.shop.shopauth.FindShopCompanyInfo
import org.testng.annotations.Test

class FindShopCompanyInfoTest extends BaseTest {
    FindShopCompanyInfo findShopCompanyInfo = new FindShopCompanyInfo()
    @Test(description = "查询店铺企业信息 findShopCompanyInfo" ,groups = ["prod","uat"],testName = "findShopCompanyInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopCompanyInfo(TestContext testContext){
        findShopCompanyInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
