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
        testContext.put("id",1405981112139808)
        testContext.put("page",1)
        testContext.put("rows",10)
        findInviteCodeList.invoke(testContext).baseAssert(testContext)
    }
}
