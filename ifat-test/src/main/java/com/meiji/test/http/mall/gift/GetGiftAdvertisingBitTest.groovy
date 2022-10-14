package com.meiji.test.http.mall.gift

import com.meiji.biz.request.http.mall.gift.GetGiftAdvertisingBit
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGiftAdvertisingBitTest extends BaseTest {
    GetGiftAdvertisingBit getGiftAdvertisingBit = new GetGiftAdvertisingBit()
    @Test(description = "根据送礼页面获取广告位配置 getGiftAdvertisingBit" ,groups = ["prod","uat"],testName = "getGiftAdvertisingBit",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGiftAdvertisingBit(TestContext testContext){
        testContext.put("location",1)
        getGiftAdvertisingBit.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "根据送礼页面获取广告位配置 getGiftAdvertisingBit" ,groups = ["prod","uat"],testName = "getGiftAdvertisingBit",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGiftAdvertisingBit1(TestContext testContext){
        testContext.put("location",2)
        getGiftAdvertisingBit.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}