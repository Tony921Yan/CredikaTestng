package com.credika.test.http.testInterface.cps

import com.credika.biz.request.http.testInterface.cps.ConvertShareUrl
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ConvertShareUrlTest extends BaseTest {
    ConvertShareUrl convertShareUrl = new ConvertShareUrl()
    @Test(description = "转换分享链接 convertShareUrl" ,groups = ["prod","uat"],testName = "convertShareUrl",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void convertShareUrl(TestContext testContext){
        convertShareUrl.invoke(testContext).baseAssert(testContext)
    }
}
