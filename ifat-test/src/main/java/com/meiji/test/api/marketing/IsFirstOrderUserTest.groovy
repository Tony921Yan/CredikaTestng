package com.meiji.test.api.marketing

import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.marketing.IsFirstOrderUser
import org.testng.annotations.Test

class IsFirstOrderUserTest {
    IsFirstOrderUser isFirstOrderUser = new IsFirstOrderUser()
    @Test(description = "是否首单用户" ,groups = ["prod","uat"],testName = "isFirstOrderUser",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void isFirstOrderUser(TestContext testContext){
        isFirstOrderUser.invoke(testContext)
    }
}
