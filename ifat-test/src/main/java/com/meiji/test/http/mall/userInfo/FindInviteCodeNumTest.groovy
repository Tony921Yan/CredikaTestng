package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.userInfo.FindInviteCodeNum
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindInviteCodeNumTest extends BaseTest {
    FindInviteCodeNum findInviteCodeNum = new FindInviteCodeNum()
    @Test(description = "我的邀请码 findInviteCodeNum" ,groups = ["prod","uat"],testName = "findInviteCodeNum",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findInviteCodeNum(TestContext testContext){
        findInviteCodeNum.invoke(testContext).baseAssert(testContext)
    }
}
