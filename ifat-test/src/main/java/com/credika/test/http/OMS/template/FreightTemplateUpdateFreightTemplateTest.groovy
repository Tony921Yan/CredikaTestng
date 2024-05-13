package com.credika.test.http.OMS.template
import com.credika.biz.request.http.OMS.template.FreightTemplateUpdateFreightTemplate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FreightTemplateUpdateFreightTemplateTest extends BaseTest{
    FreightTemplateUpdateFreightTemplate freightTemplateUpdateFreightTemplate = new FreightTemplateUpdateFreightTemplate()
    @Test(description = "更新运费模板 freightTemplateUpdateFreightTemplate" ,groups = ["prod","uat"],testName = "freightTemplateUpdateFreightTemplate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void freightTemplateUpdateFreightTemplate(TestContext testContext){
        freightTemplateUpdateFreightTemplate.invoke(testContext).baseAssert(testContext)
    }
}
