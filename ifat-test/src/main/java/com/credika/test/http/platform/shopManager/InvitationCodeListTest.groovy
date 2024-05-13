package com.credika.test.http.platform.shopManager

import com.credika.biz.request.http.platform.shopmanager.InvitationCodeList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class InvitationCodeListTest extends BaseTest {
    InvitationCodeList invitationCodeList = new InvitationCodeList()
    @Test(description = "邀请码明细 invitationCodeList" ,groups = ["prod","uat"],testName = "invitationCodeList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void invitationCodeList(TestContext testContext){
        invitationCodeList.invoke(testContext).baseAssert(testContext)
        invitationCodeList.specialAssert(testContext)
    }
}
