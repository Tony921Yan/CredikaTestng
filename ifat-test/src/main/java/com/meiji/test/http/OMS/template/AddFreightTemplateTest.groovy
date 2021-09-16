package com.meiji.test.http.OMS.template

import com.meiji.biz.request.http.OMS.template.AddFreightTemplate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddFreightTemplateTest extends BaseTest{

    AddFreightTemplate addFreightTemplate = new AddFreightTemplate()
    @Test(description = "新增运费模板 addFreightTemplate" ,groups = ["prod","uat"],testName = "OMSaddFreightTemplate",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addFreightTemplate(TestContext testContext){
        addFreightTemplate.invoke(testContext).baseAssert(testContext)
    }
}
