package com.meiji.test.http.shop


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetShopWeappCodeTest extends BaseTest {
    com.meiji.biz.request.http.shop.shopauth.GetShopWeappCode getShopWeappCode = new com.meiji.biz.request.http.shop.shopauth.GetShopWeappCode()
    @Test(description = "获取店铺小程序码 getShopWeappCode" ,groups = ["prod","uat"],testName = "getShopWeappCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getShopWeappCode(TestContext testContext){
        getShopWeappCode.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}