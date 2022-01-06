package com.meiji.test.http.OMS.template

import com.meiji.biz.request.http.OMS.template.FreightTemplateAddFreightTemplate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FreightTemplateAddFreightTemplateTest extends BaseTest{
    FreightTemplateAddFreightTemplate freightTemplateAddFreightTemplate = new FreightTemplateAddFreightTemplate()
    @Test(description = "新增运费模板 freightTemplateAddFreightTemplate" ,groups = ["prod","uat"],testName = "freightTemplateAddFreightTemplate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void freightTemplateAddFreightTemplate(TestContext testContext){
        freightTemplateAddFreightTemplate.invoke(testContext).baseAssert(testContext)
    }
}
