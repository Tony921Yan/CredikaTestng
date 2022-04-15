package com.meiji.test.http.platform.shopManager


import com.meiji.biz.request.http.platform.shopmanager.UnfreezeInviteCode
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UnfreezeInviteCodeTest extends BaseTest {
    UnfreezeInviteCode unfreezeInviteCode = new UnfreezeInviteCode()
    @Test(description = "解冻邀请码 unfreezeInviteCode" ,groups = ["prod","uat"],testName = "unfreezeInviteCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void unfreezeInviteCode(TestContext testContext){
        unfreezeInviteCode.invoke(testContext).baseAssert(testContext)
    }
}
