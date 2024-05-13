package com.credika.test.http.platform.integral


import com.credika.biz.request.http.platform.integral.PlatformIntegralQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PlatformIntegralQueryTest extends BaseTest {
    PlatformIntegralQuery platformIntegralQuery = new PlatformIntegralQuery()
    @Test(description = "平台积分查询 platformIntegralQuery" ,groups = ["prod","uat"],testName = "platformIntegralQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void platformIntegralQuery(TestContext testContext){
        platformIntegralQuery.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
