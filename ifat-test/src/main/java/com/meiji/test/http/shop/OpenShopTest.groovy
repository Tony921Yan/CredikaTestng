package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.AddShopGoods
import com.meiji.request.http.shop.OpenShop
import org.testng.annotations.Test

class OpenShopTest extends BaseTest {
    OpenShop openShop = new  OpenShop()
    @Test(description = "申请开店 openShop" ,groups = ["prod","uat"],testName = "openShop",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void openShop(TestContext testContext){
        openShop.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
