package com.credika.test.http.platform.other


import com.credika.biz.request.http.platform.other.SystemConfigMgr
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SystemConfigMgrTest extends BaseTest {
    SystemConfigMgr systemConfigMgr = new SystemConfigMgr()
    @Test(description = "新手引导二维码 systemConfigMgr" ,groups = ["prod","uat"],testName = "systemConfigMgr",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void systemConfigMgr(TestContext testContext){
        testContext.put("key","dealerTutorQrCode")
        systemConfigMgr.invoke(testContext).baseAssert(testContext)
    }
}
