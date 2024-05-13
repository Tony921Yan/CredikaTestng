package com.credika.test.http.platform.activeMainManage.marketAccount

import com.credika.biz.request.http.platform.activeMainManage.marketAccount.UserManageList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UserManageListTest extends BaseTest {
    UserManageList userManageList = new UserManageList()
    @Test(description = "查询营销账户-用户管理列表 userManageList" ,groups = ["prod","uat"],testName = "userManageList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void userManageList(TestContext testContext){
        testContext.put("pageSize",10000)
        userManageList.invoke(testContext).baseAssert(testContext)
    }

}