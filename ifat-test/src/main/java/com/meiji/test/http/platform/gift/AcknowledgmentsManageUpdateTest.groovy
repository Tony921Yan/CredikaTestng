package com.meiji.test.http.platform.gift

import com.meiji.biz.request.http.platform.gift.AcknowledgmentsManageUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/25 14:48
 * @Vession V2.6
 */
class AcknowledgmentsManageUpdateTest extends BaseTest{
    AcknowledgmentsManageUpdate acknowledgmentsManageUpdate = new AcknowledgmentsManageUpdate()
    @Test(description = "acknowledgmentsManageUpdate,送礼文案修改",groups = ["uat","prod"],testName = "acknowledgmentsManageUpdate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void acknowledgmentsManageUpdate(TestContext testContext){
        acknowledgmentsManageUpdate.invoke(testContext).baseAssert(testContext)
    }
}
