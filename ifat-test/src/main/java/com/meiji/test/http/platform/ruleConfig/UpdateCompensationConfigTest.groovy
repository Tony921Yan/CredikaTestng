package com.meiji.test.http.platform.ruleConfig

import com.meiji.biz.request.http.platform.ruleConfig.UpdateCompensationConfig
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateCompensationConfigTest extends BaseTest {
    UpdateCompensationConfig updateCompensationConfig = new UpdateCompensationConfig()

    @Test(description = "修改买贵必赔配置 updateCompensationConfig", groups = ["prod", "uat"], testName = "updateCompensationConfig-p",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void updateCompensationConfig(TestContext testContext) {
        updateCompensationConfig.invoke(testContext).baseAssert(testContext)
    }


}



