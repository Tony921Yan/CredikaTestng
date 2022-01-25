package com.meiji.test.http.platform.member

import com.meiji.biz.request.http.platform.member.FindUserLogInfo
import com.meiji.biz.request.http.platform.member.UpdateUserInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateUserInfoTest extends BaseTest {
   UpdateUserInfo updateUserInfo = new UpdateUserInfo()
    @Test(description = "更新会员信息 updateUserInfo" ,groups = ["prod","uat"],testName = "updateUserInfo",
           dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLabel(TestContext testContext){
        updateUserInfo.invoke(testContext).baseAssert(testContext)
    }
}
