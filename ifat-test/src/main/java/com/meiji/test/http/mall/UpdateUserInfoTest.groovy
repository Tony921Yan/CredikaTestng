package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.UpdateUserInfo
import org.testng.annotations.Test

class UpdateUserInfoTest extends BaseTest {
    UpdateUserInfo updateUserInfo = new UpdateUserInfo()
    @Test(description = "更新用户信息 updateUserInfo" ,groups = ["prod","uat"],testName = "updateUserInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateUserInfo(TestContext testContext){
        updateUserInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
