package com.credika.test.http.OMS.template


import com.credika.biz.request.http.OMS.template.FreightTemplateDeleteFreightTemplate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FreightTemplateDeleteFreightTemplateTest extends BaseTest{
    FreightTemplateDeleteFreightTemplate freightTemplateDeleteFreightTemplate = new FreightTemplateDeleteFreightTemplate()
    @Test(description = "删除运费模板 freightTemplateDeleteFreightTemplate" ,groups = ["prod","uat"],testName = "freightTemplateDeleteFreightTemplate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void freightTemplateDeleteFreightTemplate(TestContext testContext){
        freightTemplateDeleteFreightTemplate.invoke(testContext).baseAssert(testContext)
    }
}
