package com.meiji.test.http.shop.shopauth


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AuthTest extends BaseTest {
    com.meiji.biz.request.http.shop.shopauth.Auth auth = new com.meiji.biz.request.http.shop.shopauth.Auth()
    @Test(description = "店铺认证 auth" ,groups = ["prod","uat"],testName = "auth",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auth(TestContext testContext){
        auth.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
