package com.meiji.test.http.shop.shopauth

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.shopauth.Auth
import com.meiji.request.http.shop.shopauth.FindShopBusinessInfo
import org.testng.annotations.Test

class FindShopBusinessInfoTest extends BaseTest {
    FindShopBusinessInfo findShopBusinessInfo = new FindShopBusinessInfo()
    @Test(description = "查询店铺营业信息 findShopBusinessInfo" ,groups = ["prod","uat"],testName = "findShopBusinessInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopBusinessInfo(TestContext testContext){
        findShopBusinessInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
