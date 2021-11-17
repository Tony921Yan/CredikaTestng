package com.meiji.test.http.OMS.template


import com.meiji.biz.request.http.OMS.template.FreightTemplateDeleteFreightTemplate
import com.meiji.biz.request.http.OMS.template.FreightTemplateGetFreightTemplateInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FreightTemplateGetFreightTemplateInfoTest extends BaseTest{
    FreightTemplateGetFreightTemplateInfo freightTemplateGetFreightTemplateInfo = new FreightTemplateGetFreightTemplateInfo()
    @Test(description = "运费模板详情 freightTemplateGetFreightTemplateInfo" ,groups = ["prod","uat"],testName = "freightTemplateGetFreightTemplateInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void freightTemplateGetFreightTemplateInfo(TestContext testContext){
        freightTemplateGetFreightTemplateInfo.invoke(testContext).baseAssert(testContext)
    }
}
