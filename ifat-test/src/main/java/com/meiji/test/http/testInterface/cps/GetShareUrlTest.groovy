package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.GetShareUrl
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetShareUrlTest extends BaseTest{
    GetShareUrl getShareUrl = new GetShareUrl()
    @Test(description = "获取分享地址 getShareUrl" ,groups = ["debug"],testName = "debug",
            dataProvider = "common",dataProviderClass = TestData.class)
    public void debug(TestContext testContext){
        testContext.put("bizType","1")
        testContext.put("channel","1")
        testContext.put("distributorId","11167015")
        testContext.put("platform","mini")
        testContext.put("spuId","1419209995190305")
        getShareUrl.invoke(testContext)
    }
}
