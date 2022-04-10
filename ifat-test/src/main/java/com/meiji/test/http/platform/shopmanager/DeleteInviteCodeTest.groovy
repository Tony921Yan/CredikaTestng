package com.meiji.test.http.platform.shopManager

import com.meiji.biz.request.http.platform.shopmanager.DeleteInviteCode
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteInviteCodeTest extends BaseTest {
    DeleteInviteCode deleteInviteCode = new DeleteInviteCode()
    @Test(description = "删除邀请码 " ,groups = ["prod","uat"],testName = "deleteInviteCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteInviteCode(TestContext testContext){
        deleteInviteCode.invoke(testContext).baseAssert(testContext)
    }
}
