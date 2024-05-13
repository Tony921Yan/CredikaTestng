package com.credika.test.http.mall.orderInfo

import com.credika.biz.request.http.mall.orderInfo.GetConfigValue
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetConfigValueTest extends BaseTest {
    GetConfigValue getConfigValue = new GetConfigValue()
    @Test(description = "添加导师 getConfigValue" ,groups = ["prod","uat"],testName = "getConfigValue",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getConfigValue(TestContext testContext){
        testContext.put("key","dealerTutorQrCode")
        getConfigValue.invoke(testContext).baseAssert(testContext)
    }
}
