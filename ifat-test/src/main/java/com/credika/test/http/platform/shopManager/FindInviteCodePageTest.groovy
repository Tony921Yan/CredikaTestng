package com.credika.test.http.platform.shopManager


import com.credika.biz.request.http.platform.shopmanager.FindInviteCodePage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindInviteCodePageTest extends BaseTest {
    FindInviteCodePage findInviteCodePage = new FindInviteCodePage()
    @Test(description = "查询邀请码分页 findInviteCodePage" ,groups = ["prod","uat"],testName = "findInviteCodePage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findInviteCodePage(TestContext testContext){
        findInviteCodePage.invoke(testContext).baseAssert(testContext)
    }
}
