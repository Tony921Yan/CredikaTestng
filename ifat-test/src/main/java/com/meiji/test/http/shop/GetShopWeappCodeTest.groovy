package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.shopauth.GetShopWeappCode
import org.testng.annotations.Test

class GetShopWeappCodeTest extends BaseTest {
    GetShopWeappCode getShopWeappCode = new GetShopWeappCode()
    @Test(description = "获取店铺小程序码 getShopWeappCode" ,groups = ["prod","uat"],testName = "getShopWeappCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getShopWeappCode(TestContext testContext){
        getShopWeappCode.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
