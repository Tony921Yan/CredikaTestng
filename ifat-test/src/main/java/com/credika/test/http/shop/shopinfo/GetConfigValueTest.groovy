package com.credika.test.http.shop.shopinfo

import com.credika.biz.request.http.shop.shopinfo.GetConfigValue
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetConfigValueTest extends BaseTest {
    GetConfigValue getConfigValue = new GetConfigValue()
    @Test(description = "查询系统配置属性 getConfigValue" ,groups = ["prod","uat"],testName = "getConfigValue",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getConfigValue(TestContext testContext){
        getConfigValue.invoke(testContext).baseAssert(testContext)
    }
}
