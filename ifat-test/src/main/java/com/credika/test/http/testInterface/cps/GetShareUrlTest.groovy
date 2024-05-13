package com.credika.test.http.testInterface.cps


import com.credika.biz.request.http.testInterface.cps.GetShareUrl
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetShareUrlTest extends BaseTest {
    GetShareUrl getShareUrl = new GetShareUrl()
    @Test(description = "长链转短链 getShortUrl" ,groups = ["prod","uat"],testName = "getShortUrl",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getShareUrl(TestContext testContext){
        testContext.put("bizType",1)
        testContext.put("channel",1)
        testContext.put("platform","app")
        testContext.put("distributorId","123456")
        testContext.put("spuId",1410324940980257)
        getShareUrl.invoke(testContext).baseAssert(testContext)
    }
}
