package com.credika.test.http.platform.other


import com.credika.biz.request.http.platform.other.GetFreightTemplateInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetFreightTemplateInfoTest extends BaseTest {
    GetFreightTemplateInfo getFreightTemplateInfo = new GetFreightTemplateInfo()
    @Test(description = "运费模板详情 getFreightTemplateInfo" ,groups = ["prod","uat"],testName = "getFreightTemplateInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getFreightTemplateInfo(TestContext testContext){
        getFreightTemplateInfo.invoke(testContext).baseAssert(testContext)
    }
}
