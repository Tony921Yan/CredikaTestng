package com.meiji.test.http.mall.user

import com.meiji.biz.request.http.mall.user.IsSubscribe
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class IsSubscribeTest extends BaseTest {
    IsSubscribe isSubscribe = new IsSubscribe()
    @Test(description = "判断用户有没有关注公众号 isSubscribe" ,groups = ["prod","uat"],testName = "isSubscribe",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void isSubscribe(TestContext testContext){
        isSubscribe.invoke(testContext).baseAssert(testContext)
    }
}
