package com.credika.test.http.platform.shopManager

import com.credika.biz.request.http.platform.shopmanager.InvitationCodeListQueryPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class InvitationCodeListQueryPageTest extends BaseTest {
     InvitationCodeListQueryPage invitationCodeListQueryPage = new InvitationCodeListQueryPage()
    @Test(description = "邀请码明细列表查询 invitationCodeListQueryPage" ,groups = ["prod","uat"],testName = "invitationCodeListQueryPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void invitationCodeListQueryPage(TestContext testContext){
        invitationCodeListQueryPage.invoke(testContext)
    }
}
