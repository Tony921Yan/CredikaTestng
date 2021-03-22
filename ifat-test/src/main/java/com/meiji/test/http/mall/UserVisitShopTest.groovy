package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.UserVisitShop
import org.testng.annotations.Test

class UserVisitShopTest extends BaseTest {
    UserVisitShop userVisitShop = new UserVisitShop()
    @Test(description = "用户访问店铺 userVisitShop" ,groups = ["prod","uat"],testName = "userVisitShop",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void userVisitShop(TestContext testContext){
        userVisitShop.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
