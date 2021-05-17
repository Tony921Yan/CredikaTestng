package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UserVisitShopTest extends BaseTest {
    com.meiji.biz.request.http.mall.UserVisitShop userVisitShop = new com.meiji.biz.request.http.mall.UserVisitShop()
    @Test(description = "用户访问店铺 userVisitShop" ,groups = ["prod","uat"],testName = "userVisitShop",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void userVisitShop(TestContext testContext){
        userVisitShop.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
