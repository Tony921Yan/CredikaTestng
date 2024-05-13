package com.credika.test.http.mall.integral
import com.credika.biz.request.http.mall.integral.SignRemindSetting
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SignRemindSettingTest extends BaseTest{
    SignRemindSetting signRemindSetting = new SignRemindSetting()
    @Test(description = "签到提醒设置 signRemindSetting" ,groups = ["prod","uat"],testName = "signRemindSetting",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void signRemindSetting(TestContext testContext){
        signRemindSetting.invoke(testContext).baseAssert(testContext)
    }
}
