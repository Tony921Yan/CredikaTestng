package com.meiji.test.http.shop.dealer

import com.meiji.biz.request.http.shop.dealer.MsgTemplate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MsgTemplateTest extends BaseTest {
    MsgTemplate msgTemplate = new MsgTemplate()
    @Test(description = "小程序模板消息授权 msgTemplate" ,groups = ["prod","uat"],testName = "msgTemplate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void msgTemplate(TestContext testContext){
        msgTemplate.invoke(testContext).baseAssert(testContext)
    }
}
