package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.userInfo.FindInviteCodeList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindInviteCodeListTest extends BaseTest {
    FindInviteCodeList findInviteCodeList = new FindInviteCodeList()
    @Test(description = "查询邀请码列表 findInviteCodeList" ,groups = ["prod","uat"],testName = "findInviteCodeList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findInviteCodeList(TestContext testContext){
//        findInviteCodeList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
        findInviteCodeList.invoke(testContext).baseAssert(testContext)
    }
}
