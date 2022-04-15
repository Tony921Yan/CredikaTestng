package com.meiji.test.http.platform.shopManager


import com.meiji.biz.request.http.platform.shopmanager.InvitationListQueryPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class InvitationListQueryPageTest extends BaseTest {
    InvitationListQueryPage invitationListQueryPage = new InvitationListQueryPage()
    @Test(description = "邀请码兑换记录列表查询 invitationListQueryPage" ,groups = ["prod","uat"],testName = "invitationListQueryPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void invitationListQueryPage(TestContext testContext){
        invitationListQueryPage.invoke(testContext).baseAssert(testContext)
    }
}
