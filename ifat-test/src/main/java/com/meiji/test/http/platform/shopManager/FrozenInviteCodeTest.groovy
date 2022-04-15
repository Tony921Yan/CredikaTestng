package com.meiji.test.http.platform.shopManager

import com.meiji.biz.request.http.platform.shopmanager.FrozenInviteCode
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FrozenInviteCodeTest extends BaseTest {
    FrozenInviteCode frozenInviteCode = new FrozenInviteCode()
    @Test(description = "冻结邀请码 " ,groups = ["prod","uat"],testName = "frozenInviteCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void frozenInviteCode(TestContext testContext){
        frozenInviteCode.invoke(testContext).baseAssert(testContext)
    }
}
