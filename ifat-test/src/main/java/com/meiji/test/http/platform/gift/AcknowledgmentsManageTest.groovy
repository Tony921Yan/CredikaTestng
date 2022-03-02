package com.meiji.test.http.platform.gift
import com.meiji.biz.request.http.platform.gift.AcknowledgmentsManage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy*
 * @date 2022/02/25 10:19
 * @Vession V2.6
 */
class AcknowledgmentsManageTest extends BaseTest{
    AcknowledgmentsManage acknowledgmentsManage = new AcknowledgmentsManage()
    @Test(description = "acknowledgmentsManage 送礼文案管理",groups = ["uat","prod"],testName = "acknowledgmentsManage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void acknowledgmentsManage(TestContext testContext){
        acknowledgmentsManage.invoke(testContext).baseAssert(testContext)
    }
}