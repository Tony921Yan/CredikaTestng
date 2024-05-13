package com.credika.test.http.scrm.wx

import com.credika.biz.request.http.scrm.wxDepartment.WxMemberList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-15:00
 */
class WxMemberListTest extends BaseTest {
    WxMemberList wxMemberList = new WxMemberList()
    @Test(description = "获取微信部门成员列表", groups = ["prod", "uat"], testName = "wxMemberList",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        wxMemberList.invoke(testContext).baseAssert(testContext)
    }
}
