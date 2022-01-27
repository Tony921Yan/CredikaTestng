package com.meiji.test.http.platform.member

import com.meiji.biz.request.http.platform.member.FindUserInfo
import com.meiji.biz.request.http.platform.member.UpdateUserInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindUserInfoTest extends BaseTest {
   FindUserInfo findUserInfo = new FindUserInfo()
    @Test(description = "查询会员详情 findUserInfo" ,groups = ["prod","uat"],testName = "findUserInfo",
           dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLabel(TestContext testContext){
        findUserInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
