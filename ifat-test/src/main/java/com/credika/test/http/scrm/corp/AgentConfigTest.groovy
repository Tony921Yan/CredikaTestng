package com.credika.test.http.scrm.corp

import com.credika.biz.request.http.scrm.corp.AgentConfig
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-15:54
 */
class AgentConfigTest extends BaseTest {

    AgentConfig agentConfig = new AgentConfig()

    @Test(description = "通讯录组件获取配置信息 agentConfig", groups = ["prod", "uat"], testName = "agentConfig",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        agentConfig.invoke(testContext).baseAssert(testContext)
    }
}
