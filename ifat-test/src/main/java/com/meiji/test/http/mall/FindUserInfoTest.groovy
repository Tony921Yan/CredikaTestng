package com.meiji.test.http.mall

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.mall.FindUserInfo
import org.testng.annotations.Test

class FindUserInfoTest extends BaseTest {
    FindUserInfo findUserInfo = new FindUserInfo()
    @Test(description = "查询当前用户信息 findUserInfo" ,groups = ["prod","uat"],testName = "findUserInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findUserInfo(TestContext testContext){
        findUserInfo.invoke(testContext).baseAssert(testContext)
    }
}
