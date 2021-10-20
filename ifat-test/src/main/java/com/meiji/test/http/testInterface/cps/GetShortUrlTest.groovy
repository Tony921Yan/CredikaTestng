package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.GetAllCategory
import com.meiji.biz.request.http.testInterface.cps.GetShortUrl
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetShortUrlTest extends BaseTest {
    GetShortUrl getShortUrl = new GetShortUrl()
    @Test(description = "长链转短链 getShortUrl" ,groups = ["prod","uat"],testName = "getShortUrl",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getShortUrl(TestContext testContext){
        testContext.put("channel",1)
        testContext.put("distributorId",1)
        testContext.put("platform","app")
        testContext.put("spuId",1410324940980257)
        getShortUrl.invoke(testContext).baseAssert(testContext)
    }
}
