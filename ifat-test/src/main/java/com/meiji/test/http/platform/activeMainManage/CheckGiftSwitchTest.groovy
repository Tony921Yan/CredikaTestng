package com.meiji.test.http.platform.activeMainManage
import com.meiji.biz.request.http.platform.activeMainManage.CheckGiftSwitch
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CheckGiftSwitchTest extends BaseTest {
    CheckGiftSwitch checkGiftSwitch = new CheckGiftSwitch()
    @Test(description = "校验送礼开关打开-关闭 checkGiftSwitch" ,groups = ["prod","uat"],testName = "checkGiftSwitch",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void checkGiftSwitch(TestContext testContext){
        checkGiftSwitch.invoke(testContext).baseAssert(testContext)
    }


}