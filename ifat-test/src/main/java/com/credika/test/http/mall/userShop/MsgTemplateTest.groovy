package com.credika.test.http.mall.userShop

import com.credika.biz.request.http.mall.userShop.MsgTemplate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/03/18 12:07
 * @Vession v2.6.3
 * */
class MsgTemplateTest extends BaseTest{
    MsgTemplate msgTemplate = new MsgTemplate()
    @Test(description = "msgTemplate 小程序模板消息授权", groups = ["uat","prod"],testName = "msgTemplate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void msgTemplate(TestContext testContext){
        msgTemplate.invoke(testContext).baseAssert(testContext)
    }
}
