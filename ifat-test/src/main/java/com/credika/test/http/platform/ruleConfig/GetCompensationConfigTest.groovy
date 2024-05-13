package com.credika.test.http.platform.ruleConfig

import com.credika.biz.request.http.platform.ruleConfig.GetCompensationConfig
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCompensationConfigTest extends BaseTest {
    GetCompensationConfig getCompensationConfig = new GetCompensationConfig()

    @Test(description = "查询买贵必赔配置 getCompensationConfig", groups = ["prod", "uat"], testName = "getCompensationConfig-p",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void getCompensationConfig(TestContext testContext) {
        getCompensationConfig.invoke(testContext).baseAssert(testContext)
    }


}



