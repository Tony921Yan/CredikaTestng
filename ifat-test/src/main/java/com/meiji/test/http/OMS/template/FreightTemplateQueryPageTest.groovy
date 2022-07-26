package com.meiji.test.http.OMS.template
import com.meiji.biz.request.http.OMS.template.FreightTemplateQueryPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FreightTemplateQueryPageTest extends BaseTest{
    FreightTemplateQueryPage freightTemplateQueryPage = new FreightTemplateQueryPage()
    @Test(description = "运费模板分页 freightTemplateQueryPage" ,groups = ["prod","uat"],testName = "freightTemplateQueryPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void freightTemplateQueryPage(TestContext testContext){
        freightTemplateQueryPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
