package com.credika.test.http.platform.shopManager

import com.credika.biz.request.http.platform.shopmanager.AddInviteCodeApply
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddInviteCodeApplyTest extends BaseTest {
    AddInviteCodeApply addInviteCodeApply = new AddInviteCodeApply()
    @Test(description = "申请邀请码 " ,groups = ["prod","uat"],testName = "addInviteCodeApply",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addInviteCodeApply(TestContext testContext){
        addInviteCodeApply.invoke(testContext).baseAssert(testContext)
    }
}
