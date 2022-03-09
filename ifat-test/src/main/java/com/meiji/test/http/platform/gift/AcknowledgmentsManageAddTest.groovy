package com.meiji.test.http.platform.gift

import com.meiji.biz.request.http.platform.gift.AcknowledgmentsManageAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/25 10:31
 * @Vession V2.6
 */
class AcknowledgmentsManageAddTest extends BaseTest{
    AcknowledgmentsManageAdd acknowledgmentsManageAdd = new AcknowledgmentsManageAdd()
    @Test(description = "acknowledgmentsManageAdd 送礼文案添加",groups = ["uat","prod"],testName = "acknowledgmentsManageAdd",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void acknowledgmentsManageAdd(TestContext testContext){
        acknowledgmentsManageAdd.invoke(testContext).baseAssert(testContext)
    }
}
