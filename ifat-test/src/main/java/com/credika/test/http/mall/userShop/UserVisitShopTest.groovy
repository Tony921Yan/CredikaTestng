package com.credika.test.http.mall.userShop

import com.credika.biz.request.http.mall.userShop.UserVisitShop
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UserVisitShopTest extends BaseTest {
    UserVisitShop userVisitShop = new UserVisitShop()
    @Test(description = "用户访问店铺 userVisitShop" ,groups = ["prod","uat"],testName = "userVisitShop",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void userVisitShop(TestContext testContext){
        userVisitShop.invoke(testContext).baseAssert(testContext)
    }
}
