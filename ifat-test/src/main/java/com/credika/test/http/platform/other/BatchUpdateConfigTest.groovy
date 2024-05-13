package com.credika.test.http.platform.other

import com.credika.biz.request.http.platform.other.BatchUpdateConfig
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class BatchUpdateConfigTest extends BaseTest {//拿请求的数据与数据做断言
    BatchUpdateConfig batchUpdateConfig = new BatchUpdateConfig()
    @Test(description = "系统设置 batchUpdateConfig" ,groups = ["prod","uat"],testName = "batchUpdateConfig",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void batchUpdateConfig(TestContext testContext){
        batchUpdateConfig.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
