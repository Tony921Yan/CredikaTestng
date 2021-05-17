package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateUserInfoTest extends BaseTest {
    com.meiji.biz.request.http.mall.UpdateUserInfo updateUserInfo = new com.meiji.biz.request.http.mall.UpdateUserInfo()
    @Test(description = "更新用户信息 updateUserInfo" ,groups = ["prod","uat"],testName = "updateUserInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateUserInfo(TestContext testContext){
        updateUserInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
