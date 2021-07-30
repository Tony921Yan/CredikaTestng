package com.meiji.test.http.shop.shopinfo

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.shopinfo.OpenShop
import org.testng.annotations.Test

class OpenShopTest extends BaseTest {
    OpenShop openShop = new  OpenShop()
    @Test(description = "申请开店 openShop" ,groups = ["prod","uat"],testName = "openShop",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void openShop(TestContext testContext){
        openShop.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
