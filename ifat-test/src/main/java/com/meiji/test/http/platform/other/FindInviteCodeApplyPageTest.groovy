package com.meiji.test.http.platform.other


import com.meiji.biz.request.http.platform.other.FindInviteCodeApplyPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindInviteCodeApplyPageTest extends BaseTest {
    FindInviteCodeApplyPage findInviteCodeApplyPage = new FindInviteCodeApplyPage()
    @Test(description = "查询邀请码申请分页 findInviteCodeApplyPage" ,groups = ["prod","uat"],testName = "findInviteCodeApplyPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findInviteCodeApplyPage(TestContext testContext){
        findInviteCodeApplyPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
