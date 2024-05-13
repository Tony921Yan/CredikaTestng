package com.credika.test.http.mall.userInfo

import com.credika.biz.request.http.mall.userInfo.UpdateUserInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateUserInfoTest extends BaseTest {
    UpdateUserInfo updateUserInfo = new UpdateUserInfo()
    @Test(description = "更新用户信息 updateUserInfo" ,groups = ["prod","uat"],testName = "updateUserInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateUserInfo(TestContext testContext){
        updateUserInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
