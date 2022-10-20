package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.GetConfigByModule
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetConfigByModuleTest extends BaseTest {
    GetConfigByModule getConfigByModule = new GetConfigByModule()
    @Test(description = "新手引导二维码 getConfigByModule" ,groups = ["prod","uat"],testName = "getConfigByModule",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getConfigByModule(TestContext testContext){
        testContext.put("modules",["mj-public"])
        getConfigByModule.invoke(testContext).baseAssert(testContext)
    }
}
