package com.meiji.test.http.shop.shopauth

import com.meiji.biz.request.http.shop.shopauth.Auth
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AuthTest extends BaseTest {
    Auth auth = new Auth()
    @Test(description = "店铺认证 auth" ,groups = ["prod","uat"],testName = "auth",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void auth(TestContext testContext){
        auth.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
