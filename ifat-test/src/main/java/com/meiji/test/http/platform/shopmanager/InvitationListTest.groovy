package com.meiji.test.http.platform.shopManager


import com.meiji.biz.request.http.platform.shopmanager.InvitationList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class InvitationListTest extends BaseTest {
    InvitationList invitationList = new InvitationList()
    @Test(description = "邀请码兑换记录 invitationList" ,groups = ["prod","uat"],testName = "invitationList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void invitationList(TestContext testContext){
        invitationList.invoke(testContext).baseAssert(testContext)
    }
}
