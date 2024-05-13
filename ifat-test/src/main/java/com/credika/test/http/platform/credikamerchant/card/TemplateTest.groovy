package com.credika.test.http.platform.credikamerchant.card
import com.credika.biz.request.http.platform.credikamerchant.crad.Template
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/18-20:20
 @version v2.1
 */
class TemplateTest extends BaseTest {
     Template template = new Template()
    @Test(description = "开卡模版 template" ,groups = ["prod","uat"],testName = "template",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void template(TestContext testContext){
//        testContext.put("page",1)
//        testContext.put("size",10)
        template.invoke(testContext).baseAssert(testContext)
    }

}
