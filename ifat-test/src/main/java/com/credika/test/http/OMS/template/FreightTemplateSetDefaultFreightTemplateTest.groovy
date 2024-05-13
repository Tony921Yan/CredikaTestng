package com.credika.test.http.OMS.template
import com.credika.biz.request.http.OMS.template.FreightTemplateSetDefaultFreightTemplate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FreightTemplateSetDefaultFreightTemplateTest extends BaseTest{
    FreightTemplateSetDefaultFreightTemplate freightTemplateSetDefaultFreightTemplate = new FreightTemplateSetDefaultFreightTemplate()
    @Test(description = "设置默认运费模板 freightTemplateSetDefaultFreightTemplate" ,groups = ["prod","uat"],testName = "freightTemplateSetDefaultFreightTemplate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void freightTemplateSetDefaultFreightTemplate(TestContext testContext){
        freightTemplateSetDefaultFreightTemplate.invoke(testContext).baseAssert(testContext)
    }
}
